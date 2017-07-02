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
    stage('shout') {
      steps {
        sh 'sh(returnStdout: true, script: \'git rev-parse --abbrev-ref HEAD\').trim()'
      }
    }
  }
}