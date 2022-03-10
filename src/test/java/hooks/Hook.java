package hooks;
import lombok.extern.slf4j.Slf4j;
import io.cucumber.java.After;
import utils.LocalDriverManager;
@Slf4j
public class Hook {
    @After
    public void tearDown(){
        LocalDriverManager.closeDriver();
        log.info("driver closed");
    }
}
