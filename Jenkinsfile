pipeline {
  agent any
  stages {
    stage('Prep') {
      steps {
        def hostinfo = sh(returnStdout: true, script: 'uname -a')
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
