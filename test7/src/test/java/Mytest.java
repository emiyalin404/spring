import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.test7.User;

public class Mytest {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");    
    User user=(User)context.getBean("user");
System.out.println(user.name);
    }
}
