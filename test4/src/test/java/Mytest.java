import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.test4.User;
import com.example.test4.UserT;

public class Mytest {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserT user = (UserT) context.getBean("u5");
   user.show();

    }
}
