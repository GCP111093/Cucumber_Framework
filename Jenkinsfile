pipeline {
  agent {
    docker {
      image 'maven:3.3.9-jdk-8'
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