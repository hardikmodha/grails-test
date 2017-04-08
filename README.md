# grails-test

This is a demo grails application to reproduce the custom environment specific issue in grails v3.2.8. 

Project contains....

1. Minimal configuration in `application.groovy`, where I've defined some configuration based on the specific environment.

2. I've created a `TestController` to retreive the current environment and configuration values. 

3. Application gives correct results for `development`, `test` and `production` environments. But for the custom environments `staging`, `UAT`,
and `demo` it gives the current environment as `development` environment and so the configuration values.

-------
Steps to reproduce...

1. Clone the repo.
2. Create war for custom environment `grails clean && grails -Dgrails.env=staging war`. 
3. Use `java -jar ./build/libs/TestEnv.war` and embedded container will start.
4. Hit the `http://localhost:8080/test/index`
5. You can see the current environment name and configuration values.

-------
Results I observed.

For environments `development`, `test` and `production` correct environment name and configurtion values are displayed.

But for `staging`, `UAT` and `demo` custom environments `development` is displayed as the environment name and the configuration value.

--------
**Environment Information**:

**OS**: Ubuntu 14.04 LTS

**Grails Version**: 3.2.8

**JDK Version**: 1.8.0_111
