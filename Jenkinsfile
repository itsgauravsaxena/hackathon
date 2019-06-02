pipeline {
  agent any
  stages {
    stage('Initialize') {
      agent any
      steps {
        echo 'Initializing'
      }
    }
    stage('Build') {
      agent any
      environment {
        maven = 'maven3.6.1'
        jdk = 'java9'
      }
      steps {
        sh 'mvn clean install'
      }
    }
  }
}