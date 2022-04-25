/*
 * Create an admin user.
 */
import jenkins.model.*
import hudson.security.*

println "--> creating admin user"

def env = System.getenv()

def adminUsername = env.JENKINS_USER
def adminPassword = env.JENKINS_PASS
assert adminUsername != null : "No JENKINS_USER env var provided, but required"
assert adminPassword != null : "No JENKINS_PASS env var provided, but required"

def hudsonRealm = new HudsonPrivateSecurityRealm(false)
hudsonRealm.createAccount(adminUsername, adminPassword)
Jenkins.instance.setSecurityRealm(hudsonRealm)
def strategy = new FullControlOnceLoggedInAuthorizationStrategy()
strategy.setAllowAnonymousRead(false)
Jenkins.instance.setAuthorizationStrategy(strategy)

Jenkins.instance.save()