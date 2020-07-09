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
        bat(script: 'Executor.bat "-Ddataproviderthreadcount=1" "-Dcucumber.filter.tags=@sanity and @regression" "-Dcucumber.plugin=junit:/target/sanity.xml"', returnStatus: true, returnStdout: true)
      }
    }

    stage('Report') {
      steps {
        junit '/target/*.xml'
      }
    }

  }
}