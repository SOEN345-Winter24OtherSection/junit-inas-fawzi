import static org.junit.Assert.*;

import org.junit.Test;

public class GreetingServiceTest {
    GreetingService g = new GreetingService();

    @Test
    public void getHelloWorld() {
        String test = g.getHelloWorld();
        assertEquals("Hello, World!", test);
    }

    @Test
    public void getHelloUniverse() {
        String test = g.getHelloUniverse();
        assertEquals("Hello, Universe!", test);
    }
}