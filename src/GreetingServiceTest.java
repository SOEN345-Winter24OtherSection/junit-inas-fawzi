import static org.junit.Assert.*;

import org.junit.Test;
//Lab 1, SOEN 345: Inas Fawzi 40208675 and Suha Abubakr 40120785
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