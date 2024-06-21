package app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {


    @Test
    public void MethodGetHelloWorldShouldGetThis(){
        Main main = new Main();
        Assertions.assertEquals("Hello world!",main.getHelloWorld());

    }
}
