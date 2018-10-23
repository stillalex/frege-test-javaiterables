# Frege test of java iterables

## Intro
    * example of mapping of java Iterable method
    * based on https://github.com/talios/frege-testing

## Install frege in local maven

    wget https://github.com/Frege/frege/releases/download/3.25alpha/frege3.25.57.jar -P target
    mvn install:install-file -Dfile=target/frege3.25.57.jar -DgroupId=org.frege-lang -DartifactId=frege -Dversion=3.25.57 -Dclassifier=jdk8 -Dpackaging=jar -DgeneratePom=true

    wget https://github.com/Frege/frege/releases/download/3.25alpha/frege3.25.42.jar -P target
    mvn install:install-file -Dfile=target/frege3.25.42.jar -DgroupId=org.frege-lang -DartifactId=frege -Dversion=3.25.42 -Dclassifier=jdk8 -Dpackaging=jar -DgeneratePom=true

## Run example

    mvn package
