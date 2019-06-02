pipeline {
  agent any
  stages {
    stage('Initialize') {
      steps {
        echo 'Initializing'
      }
    }
    stage('Build') {
      steps {
        sh 'mvn clean install'
      }
    }
  }
}