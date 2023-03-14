
// import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// import com.example.test5.Student;
import com.example.test5.User;

public class Mytest {
    public static void main(String[] args) {
    //   ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    // Student student=(Student) context.getBean("student");
    // System.out.println(student.toString());
    ApplicationContext context =new ClassPathXmlApplicationContext("userBeans.xml");
   User user=context.getBean("user2",User.class);
   User user2=context.getBean("user2",User.class);
        System.out.println(user.hashCode());
        System.out.println(user2.hashCode());
    System.out.println(user==user2);

    }
/* 
    Student{
        name='秦疆', 
        address=Address{address='西安'}, 
        books=[紅樓夢, 西廂記, 水滸傳, 三國演義], 
        hobbys=[聽歌, 敲代碼, 看電影], 
        card={身分證=732823795798, 
            銀行卡=28729859487349
        }, 
        games=[lol, COC, BOB], 
        wife='null', 
        info={password=123456, 
            driver=20190902, 
            url=男, 
            username=小明
        }    
    }
*/

// @Test
public void test2(){
    ApplicationContext context =new ClassPathXmlApplicationContext("userBeans.xml");
   User user=context.getBean("user",User.class);
    System.out.println(user);
}

}




