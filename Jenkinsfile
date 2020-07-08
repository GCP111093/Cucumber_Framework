pipeline {
  agent any
  stages {
    stage('Initiatlize') {
      
      steps {
        git(url: 'https://github.com/GCP111093/Cucumber_Framework.git', branch: 'CICD')
        withMaven('MAVEN_HOME'){
          sh 'mvn compile'
        }
      }
    }
  }
}
