#!/bin/bash

# Abort on error
set -e

echo -e "Create jar file and run javadoc"

# Create jar file
ant jar

# Create javadoc
ant javadoc


export DIR=$(pwd)


# Don't publish anything if the repository is a fork, or if it is a pull request or if the branch is not master

if [ "$TRAVIS_REPO_SLUG" == "danielb987/JMRI_NewLogixPlugins" ] && [ "$TRAVIS_PULL_REQUEST" == "false" ] && [ "$TRAVIS_BRANCH" == "master" ]; then

  echo -e "Publishing javadoc...\n"

  # Create a temp directory
  cd $HOME
  mkdir temp
  cd temp

  # Clone the master branch of the git repository
  git config --global user.email "travis@travis-ci.org"
  git config --global user.name "travis-ci"
  git clone --quiet --branch=master https://${GH_TOKEN}@github.com/danielb987/JMRI_NewLogixPlugins.Documentation > /dev/null

  # Change directory to the repository
  cd JMRI_NewLogixPlugins.Documentation

  # Change directory to the docs directory
  cd docs

  # Remove the old distribution folder, create a new one, and
  # copy the JMRI_NewLogixPlugins.jar file to the distribution folder.
  rm -Rf distribution
  mkdir distribution
  cp $DIR/dist/*.jar distribution/

  # Remove the javadoc folder and copy the generated javadoc folder to current folder
  rm -Rf javadoc
  cp -R $DIR/dist/javadoc .

  # Run javadoc and generate package private classes and methods
  cd $DIR
#  rm -Rf dist/javadoc
  ant clean
  ant
  ant test
  ant javadoc_develop
  mv dist/javadoc dist/javadoc_develop
  cd $HOME/temp/JMRI_NewLogixPlugins.Documentation/docs
  rm -Rf javadoc_develop
  cp -R $DIR/dist/javadoc_develop .

  # Upload the distribution and javadoc to the master branch at GitHub
  git add -f .
  git commit -m "Latest javadoc on successful travis build $TRAVIS_BUILD_NUMBER auto-pushed to master"
  git push -fq origin master > /dev/null

fi
