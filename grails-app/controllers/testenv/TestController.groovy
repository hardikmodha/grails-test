package testenv

import grails.core.GrailsApplication

class TestController {
    
    GrailsApplication grailsApplication
    
    def index() {
        render([currentEnvironment: grails.util.Environment.currentEnvironment.name,
                configValue: grailsApplication.config.test.environment])
    }
}
