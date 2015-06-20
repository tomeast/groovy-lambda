package example

import lambda.GroovyLambdaBase

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.LambdaLogger

public class GroovyLambdaExample extends GroovyLambdaBase {

    public String groovyHandler(int myCount, Context context) {
        LambdaLogger logger = context.logger
        logger.log("received : ${myCount}")
        return String.valueOf(myCount)
    }

}
