package lambda;

public class GroovyLambdaBase {

    static {
        System.out.println("static method called");
        Thread.currentThread().setContextClassLoader(GroovyLambdaBase.class.getClassLoader());
    }

}
