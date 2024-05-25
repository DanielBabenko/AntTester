import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestHello {
    @Test
    public void testHello() {
        HelloWorld hello = new HelloWorld();
        assertEquals("Hello, World!", hello.sayHello());
    }
}
