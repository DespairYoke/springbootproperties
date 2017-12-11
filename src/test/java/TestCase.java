import com.hlw.controller.ControllerTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.internal.runners.RunnerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = WebMain.class)
public class TestCase {
    @Autowired
    private ControllerTest controllerTest;
    @Test
    public void test1(){
        System.out.println(controllerTest.getName());
        System.out.println(controllerTest.getAge());
        System.out.println(controllerTest.getPerson());
    }

}
