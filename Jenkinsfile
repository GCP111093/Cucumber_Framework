pipeline {
  agent {
    node {
      label 'master'
    }

  }
  stages {
    stage('Initiatlize') {
      steps {
        echo 'Loaded Git Project'
      }
    }

    stage('Build') {
      steps {
        sh 'mvn compile'
      }
    }

  }
}