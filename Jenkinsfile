pipeline {
  agent any
  stages {
    stage('Prep') {
      steps {
        script {
          def commitId = sh(returnStdout: true, script: "git rev-parse --verify HEAD^").trim()
          println "Commit SHA1 id, " + commitId.take(9)
          sh "git show -s --pretty=%d HEAD^ > prbranch.info"
          def prbranches = readFile('prbranch.info').trim()
          def prbranch = sh(returnStdout: true, script: " echo ${prbranches} | cut -d"," -f1").trim()
          println "Pull request branch, ${prbranch}"
          // How to rename in Groovy?
          if (env.BRANCH_NAME.startsWith('PR-')) { 
            env.pullreq_branch = sh(returnStdout: true, script: "git branch -a --contains ${commitId}").trim()
            println "Pull request branch, ${pullreq_branch}"
          }
        }
      }
    }
    stage('Env') {
      steps {
        sh 'printenv'
        script {
          if (env.BRANCH_NAME.startsWith('PR-')) {
            def custom_name = env.pullreq_branch + "-" + env.CHANGE_TITLE
            currentBuild.displayName = custom_name
          }
        }
      }
    }
  }
}
