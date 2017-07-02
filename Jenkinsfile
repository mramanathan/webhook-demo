pipeline {
  agent any
  stages {
    stage('Prep') {
      steps {
        sh(returnStdout: true, script: 'uname -a').trim()
      }
    }
    stage('Env') {
      steps {
        sh 'printenv'
      }
    }
  }
}
