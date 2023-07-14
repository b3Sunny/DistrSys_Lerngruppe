package Hello;


import jakarta.jws.WebService;
//Service Implementation


@WebService(endpointInterface = "Hello.HelloWorld", targetNamespace="http://distrsys.com/")
public class HelloWorldImpl implements HelloWorld {
    @Override
    public String getHelloWorldAsString(String name) {
        return "Hello World JAX-WS " + name;
    }
}  