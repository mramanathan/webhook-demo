pipeline {
  agent any
  stages {
    stage('Prep') {
      steps {
        hostinfo = sh(returnStdout: true, script: 'uname -a').trim()
        echo "Host info, ${hostinfo}"
      }
    }
    stage('Env') {
      steps {
        sh 'printenv'
      }
    }
  }
}
