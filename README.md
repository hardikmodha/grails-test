# grails-test

This is a demo grails application to reproduce the custom environment specific issue in grails v3.2.8. 

Project contains....

1. Minimal configuration in `application.groovy`, where I've defined some configuration based on the specific environment.

2. I've created a `TestController` to retrieve the current environment and configuration values. 

-------
Steps to reproduce...

1. Clone the repo.
2. Create war for any of these custom environments `staging`, `UAT`, `demo` 
  - `grails clean && grails -Dgrails.env=staging war`
  - `grails clean && grails -Dgrails.env=UAT war`
  - `grails clean && grails -Dgrails.env=demo war`
3. Run `java -jar ./build/libs/TestEnv.war` and embedded container will start.
4. Hit the `http://localhost:8080/test/index`
5. You can see the results displayed.

-------
Results I observed.

For environments `development`, `test` and `production` correct environment name and configurtion values are displayed.

But for `staging`, `UAT` and `demo` custom environment `development` is displayed as the environment name and the configuration value.

--------
**Environment Information**:

**OS**: Ubuntu 14.04 LTS

**Grails Version**: 3.2.8

**JDK Version**: 1.8.0_111
