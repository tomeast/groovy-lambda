# groovy-lambda
Simple project based off the [lambada project](https://github.com/uswitch/lambada) to get Groovy working with AWS Lambda

Disclaimer: this project is currently a very simple proof of concept to see if/how Groovy would work with [AWS Lambda](http://aws.amazon.com/lambda/). It is entirely possible that there is an easier way or that I'm including too many jars in the finished zip.

### Step 0 - dependencies
- Ensure gradle is installed. If you don't have it already I'm a huge fan of [gvm](http://gvmtool.net/)
```
curl -s get.gvmtool.net | bash
```
then
```
gvm install gradle
```

### Step 1 - code
- Clone the project and create a new package in src/groovy or adjust the src/groovy/example class to your liking

### Step 2 - build
- gradle build
- ensure you have a zip in build/distributions/

### Step 3 - deploy
- login or create an account to access your [AWS Console](https://console.aws.amazon.com/)
- click the [Lambda](https://console.aws.amazon.com/lambda/home) link
- click the Create a Lambda function button
- fill in the name, description, select Java 8 as the runtime
- browse to the zip file created in step 2 by clicking on the upload button
- the handler should be in the form package.class::handler or example.GroovyLambdaExample::groovyHandler if you're using the example code
- create and/or select an execution role, ie basic_lambda_execution
- click the create lambda button
![](https://github.com/tomeast/groovy-lambda/blob/master/step3.png)

### Step 4 - test
- browse to the edit/test screen
- enter input based off the handler, the example code expects an int
- click the invoke button and verify that you get the respone you expect
![](https://github.com/tomeast/groovy-lambda/blob/master/step4.png)
