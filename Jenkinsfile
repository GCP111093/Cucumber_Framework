pipeline{

  agent any
  stages{
    stage('Compile'){
      steps{
        withMaven('MAVEN_HOME'){
          mvn compile
        }
      }
      
    }
  }

}
