pipeline {
  agent any
  stages {
    stage('Initiatlize') {
      agent any
      steps {
        git(url: 'https://github.com/GCP111093/Cucumber_Framework.git', branch: 'CICD')
      }
    }

    stage('Build') {
      agent any
      steps {
        bat '${MAVEN_HOME}/mvn compile'
      }
    }

  }
}