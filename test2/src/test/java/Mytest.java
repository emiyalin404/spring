
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.test2.Hello;

public class Mytest {
    public static void main(String[] args) {
        //獲取Spring 的上下文對象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    //我們的對象現在都在Srping中管理了，我們要使用，直接去裡面取出來就可以!
    Hello hello=(Hello) context.getBean("hello");
    System.out.println(hello.toString());
    ((ClassPathXmlApplicationContext) context).close();
    }
}
