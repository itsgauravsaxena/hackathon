pipeline {
  agent any
  stages {
    stage('Initialize') {
      steps {
        echo 'Initializing'
      }
    }
    stage('Build') {
      environment {
        maven = 'maven3.6.1'
        jdk = 'java9'
      }
      steps {
        sh 'mvn clean install'
      }
    }
  }
  tools {
    maven 'maven3.6.1'
    jdk 'java9'
  }
}