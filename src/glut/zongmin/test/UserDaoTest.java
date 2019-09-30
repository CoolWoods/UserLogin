package glut.zongmin.test;

import glut.zongmin.dao.UserDao;
import glut.zongmin.domain.User;
import org.junit.Test;

public class UserDaoTest {

    @Test
    public  void  tesLogin(){
        User loginUser = new User();
        loginUser.setUsername("superbay");
        loginUser.setPassword("1234");
        UserDao dao = new UserDao();
        User user = dao.login(loginUser);
        System.out.println(user);
    }
}
