pipeline {
  agent any
  stages {
    stage('Initiatlize') {
      steps {
        echo 'Loaded Git Project'
      }
    }

    stage('Build') {
      steps {
        git(url: 'https://github.com/GCP111093/Cucumber_Framework.git', branch: 'CICD', changelog: true, credentialsId: 'gcp111093')
      }
    }

  }
}