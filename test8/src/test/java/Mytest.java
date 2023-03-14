
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.KuangConfig;
import com.example.test8.User;

public class Mytest {
    public static void main(String[] args) {
        // 如果完全使用了配置類方式去做，我們就只能通過AnnotationConfig上下文來獲取容器，通過配置的class對像來加載
    ApplicationContext context =new AnnotationConfigApplicationContext(KuangConfig.class);
      User getUser = (User) context.getBean("User");
    System.out.println(getUser.getName());
    }
}
