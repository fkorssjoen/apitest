Target API Tests
================

Spock test-cases showing how to interact with Target APIs using Groovy for the GR8CONF US Hackathon.

Instructions
------------

When you arrive at the GR8CONF US Hackathon, you will register for a developer account and get your credentials to make API calls (developer accounts won’t be approved until the event). After you register and your developer account is approved at the hackathon by the Target API team, login to the developer portal (http://developer.target.com) and create an application. You will then be provided API keys for that application in the portal. Put the Consumer Key, Secret Key and User ID (the username you logged into the developer portal with) into Target.java (the Secret Key isn’t actually needed for the API tests we’ll be running though, just the Consumer Key and User ID). Next, you’ll need to create a Target.com guest account if you don’t already have an account on http://www.target.com. Once registered, put your username and password into the “when” block in GuestsSpec.groovy. In that same file, put in your first name, last name and email that you used when registering on Target.com into the “then” block. With all this in place, now it’s time to run the tests via Gradle to make sure everything works! There is no need to have anything else installed but a JDK to run the test-suite as it leverages the Gradle wrapper.

./gradlew test (linux, osx)
gradlew.bat test (windows)

If all tests pass, you’re all set to start using any of the APIs documented in the Target developer portal at the hackathon! If you encounter any problems running these tests, please find a Target API team member to help you. I hope you have fun playing with Target APIs at the GR8CONF US Hackathon!
