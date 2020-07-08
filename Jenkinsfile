pipeline {
  agent any
  stages {
    stage('Compile') {
      steps {
        sh 'mvn clean'
        bat '${MAVEN_HOME}/mvn clean'
      }
    }

  }
}