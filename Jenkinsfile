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
        bat 'sanity-api.bat'
      }
    }

    stage('Report') {
      steps {
        realtimeJUnit(testResults: '/target/cucumber.xml')
      }
    }

  }
}