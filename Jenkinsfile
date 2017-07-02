pipeline {
  agent any
  stages {
    stage('Prep') {
      steps {
        sh 'uname -a'
      }
    }
    stage('Env') {
      steps {
        sh 'printenv'
      }
    }
  }
}