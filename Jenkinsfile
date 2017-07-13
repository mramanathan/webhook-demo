node {
  timestamps {
    stage('Combo') {
      deleteDir()
    
      git url: 'https://github.com/mramanathan/webhook-demo', branch: 'master'
    
      def files = [:]
      
      files = sh(returnStdout: true, script: "git diff-tree --no-commit-id --name-only --root -r HEAD").split("\r?\n")
      
      echo "Files list, ${files}"
      println "Changeset contais " + files.size() + " files in it."
      
      if ( files.size() > 1 ) {
          println "now using it style..."
          files.each {
              println it
          }
      
          print "now with traditional for loop..."
          for (i=0; i<files.size(); i++) {
              println files[i]
          }
      } else {
        println "modified file, ${files[0]}"
      }
      
      sh "python hello.py"
    }
  }
}

