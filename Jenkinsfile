pipeline {
  agent any
  stages {
    stage('Env') {
      steps {
        sh 'printenv'
        script {
          if (env.BRANCH_NAME.startsWith('PR-')) {
            def pr_branch = env.BRANCH_NAME.replace(/^PR-/, 'pull-req-')
            def custom_name = pr_branch + "-" + env.CHANGE_TITLE
            currentBuild.displayName = custom_name
          }
        }
      }
    }
    stage('Prep') {
      steps {
        script {
          def commitId = sh(returnStdout: true, script: 'git rev-parse --verify HEAD').trim()
          println "Commit SHA1 id, " + commitId.take(9)
          def pullreq_branch = sh """
                                    git branch -a --contains commitId
                                  """
          println "Pull request branch, pullreq_branch"
        }
      }
    }
  }
}
