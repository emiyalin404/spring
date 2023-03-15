
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.test10.UserService;

public class Mytest {
    public static void main(String[] args) {
      ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
    //動態代理代理的是接口:注意點
    UserService userService=(UserService)context.getBean("userService");
    userService.add();
    }
}
