package com.target.apitest

import spock.lang.Specification
import spock.lang.Shared
import wslite.rest.*

class GuestsSpec extends Specification {

    @Shared def restClient = new RESTClient(Target.API_BASE)

    void setup() {
        restClient.httpClient.sslTrustAllCerts = true
    }

    void "guest authentication and update profile"() {
        when:
        def response = restClient.post(path: "/guests/v3/auth?key=${Target.consumerKey}&userid=${Target.userId}", accept: ContentType.JSON) {
            json logonId: "YOUR_EMAIL", logonPassword: "YOUR_PASSWORD"
        }

        then:
        assert 200 == response.statusCode
        assert "Doe" == response.json.lastName
        assert "John" == response.json.firstName
        assert "john@doe.com" == response.json.logonId
        println response.json.accessToken
    }
}
