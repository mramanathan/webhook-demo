pipeline {
  agent any
  stages {
    stage('Env') {
      steps {
        sh 'printenv'
        script {
          currentBuild.displayName = "mychoice-Name"
        }
      }
    }
    stage('Prep') {
      steps {
        script {
          def commitId = sh(returnStdout: true, script: 'git rev-parse --verify HEAD').trim()
          println "Commit SHA1 id, " + commitId.take(9)
        }
      }
    }
  }
}
