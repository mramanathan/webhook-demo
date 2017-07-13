node {
  stage('Combo') {
    deleteDir()
  
    git url: 'https://github.com/mramanathan/webhook-demo', branch: 'master'
  
    def files = sh(returnStdout: true, script: "git diff --name-only HEAD HEAD^").trim()
    echo "Files list, ${files}"

    sh "python hello.py"
  }
}
