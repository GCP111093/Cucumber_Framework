pipeline {
  agent {
    node {
      label 'GCP'
    }

  }
  stages {
    stage('Initiatlize') {
      agent {
        node {
          label 'GCP'
        }

      }
      steps {
        echo 'Loaded Git Project'
      }
    }

    stage('Build') {
      agent {
        node {
          label 'GCP'
        }

      }
      steps {
        git(url: 'https://github.com/GCP111093/Cucumber_Framework.git', branch: 'CICD', changelog: true, credentialsId: 'gcp111093')
      }
    }

  }
}