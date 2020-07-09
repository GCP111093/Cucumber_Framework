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
        bat 'Executor.bat \'-Ddataproviderthreadcount=1\' \'-Dcucumber.filter.tags="@sanity and @regression"\' \'-Dcucumber.plugin="junit:/target/sanity.xml"\''
      }
    }

    stage('Report') {
      steps {
        junit '/target/*.xml'
      }
    }

  }
}