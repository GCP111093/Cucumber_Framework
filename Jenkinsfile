pipeline {
  agent any
  stages {
    stage('Compile') {
      steps {
        sh '''withMaven(maven:\'MAVEN_HOME\'){

mvn clean

}'''
        }
      }

    }
  }