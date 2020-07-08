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
        git(url: 'https://github.com/GCP111093/Cucumber_Framework.git', branch: 'CICD', changelog: true, credentialsId: 'gcp111093')
      }
    }

  }
}