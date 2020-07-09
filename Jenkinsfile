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
        bat 'Executor.bat "1" "@sanity and @regression" "junit:%CD%/target/sanity.xml"'
      }
    }

    stage('Report') {
      steps {
        junit '**/target/*.xml'
      }
    }
    
    stage('Publish') {
      steps {
         cucumber failedFeaturesNumber: -1, failedScenariosNumber: -1, failedStepsNumber: -1, fileIncludePattern: '**/*.json', mergeFeaturesWithRetest: true, pendingStepsNumber: -1, skippedStepsNumber: -1, sortingMethod: 'ALPHABETICAL', undefinedStepsNumber: -1

      }
    }
   
  }
}
