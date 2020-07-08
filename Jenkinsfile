pipeline {
  agent any
  stages {
    stage('Compile') {
      steps {
        bat 'run.bat'
        bat 'mvn --version'
      }
    }

  }
}