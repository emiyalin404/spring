import com.Classes.dao.UserDaoImpl;
import com.Classes.dao.UserDaoMysql;
import com.Classes.dao.UserOracleImpl;
import com.Classes.service.UserService;
import com.Classes.service.UserServiceImpl;

public class Mytest {
    public static void main(String[] args) {
        UserService userService=new UserServiceImpl();
        ((UserServiceImpl) userService).setUserDao(new UserDaoMysql());
        userService.getUser();
    }
}
