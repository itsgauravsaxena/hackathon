pipeline {
  agent any
    tools {
    maven 'maven3.6.1'
    jdk 'java9'
    }
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
