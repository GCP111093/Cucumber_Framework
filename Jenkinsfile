pipeline {
  agent any
  stages {
    stage('Compile') {
      steps {
        bat 'run.bat'
      }
    }

    stage('Sanity API') {
      steps {
        bat 'Executor.bat "1" "@sanity and @regression" "junit:%CD%/target/sanity.xml"'
      }
    }

    stage('Report') {
      steps {
        junit '**/target/*.xml'
      }
    }

  }
}