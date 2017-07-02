pipeline {
  agent any
  stages {
    stage('Env') {
      steps {
        sh 'printenv'
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
    stage('repo_info') {
      steps {
        script {
          def repo_name = sh(returnStdout: true, script: 'git config --get remote.origin.url').trim()
          println "Repo name, " + repo_name
        }
        
      }
    }
  }
}