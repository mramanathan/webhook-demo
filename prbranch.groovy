#!/usr/bin/groovy

def name {

  import hudson.model.*

  def payloadString = build.buildVariableResolver.resolve("payload")

  payloadObject = new groovy.json.JsonSlurper().parseText(payloadString)

  prbranch = payloadObject.pull_request.head.ref
  
  echo "PR branch, ${prbranch}"
}

return this;
