pipeline {
  agent any
    tools {
    maven 'maven 3'
    jdk 'java 8'
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
