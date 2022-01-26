import classroom.Calculator;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

@Slf4j
public class CalculatorTest {

    Calculator casio = new Calculator("casioV2", false);

    @Test
    public void addMethodTest(){
        log.info("Testing add method");
        log.debug("Testing add method");
        assertEquals(250, casio.add(200,50));
    }

    @Test
    public void subMethodTest(){
        log.error("test error");
        assertEquals(150, casio.sub(200,50));
    }

    @Test
    public void divMethodTest(){
        assertEquals(4, casio.div(200,50));
    }

    @Test
    public void mulMethodTest(){
        assertEquals(10000, casio.mul(200,50));
    }

    @Test
    public void powerMethodTest(){
        assertEquals(4, casio.pow(2));
    }

    @Test
    public void getMethodTest(){
        assertEquals("casioV2", casio.getName(), "incorrect");
    }

    @Test
    public void isScientificMethodTest(){
        assertFalse(casio.isScientific(), "incorrect");
    }
}
