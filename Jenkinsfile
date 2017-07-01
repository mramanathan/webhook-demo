pipeline {
  agent any
  stages {
    stage('Prep') {
      steps {
        sh 'sh (returnStdout: true, script: "uname -a")'
      }
    }
    stage('Env') {
      steps {
        sh 'sh "printenv"'
      }
    }
  }
}