import com.ping.Service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void run1(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService=context.getBean("accountService",AccountService.class);
         accountService.findAll();
    }
}
