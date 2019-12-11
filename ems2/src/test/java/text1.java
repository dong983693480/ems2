import com.baizhi.entity.Admin;
import com.baizhi.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class text1 {
    /*private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
*/
    @Test
    public void test1(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserService userService = (UserService)ac.getBean("userService");
        Admin a = userService.login("qq", "qq");
        System.out.println(a);

    }
}
