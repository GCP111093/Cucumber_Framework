pipeline {
  agent any
  stages {
    stage('Initiatlize') {
      agent any
      steps {
        echo 'Loaded Git Project'
      }
    }

    stage('Build') {
      agent any
      steps {
        sh 'mvn compile'
      }
    }

  }
}