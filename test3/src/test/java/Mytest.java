
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Classes.service.UserServiceImpl;

public class Mytest {
    public static void main(String[] args) {
        //獲取ApplicationContext;
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userServiceImpl=(UserServiceImpl) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();
        ((ClassPathXmlApplicationContext) context).close();
}
}
