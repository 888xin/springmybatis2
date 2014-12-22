package com.lhx.test;

import com.lhx.dao.UserDao;
import com.lhx.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by lhx on 14-12-22 下午2:09
 *
 * @project springmybatis2
 * @package com.lhx.test
 * @blog http://blog.csdn.net/u011439289
 * @email 888xin@sina.com
 * @Description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/applicationContext.xml")
public class UserServiceTest {

    @Autowired
    UserDao userDao;

    @Test
    public void testQueryById(){
        User u = userDao.queryById(1);
        if(u != null){
            System.out.println(u);
        }
    }

    @Test
    public void testInsert() {
        for(int i = 0; i < 100; i++){
            User u = new User();
            u.setUsername("whh");
            u.setPassword("sb");
            userDao.save(u);
        }
        System.out.println("保存成功！");
    }

    @Test
    public void testUpdate(){
        User u = userDao.queryById(3);
        u.setUsername("scott");
        u.setPassword("scott");
        userDao.update(u);
        System.out.println("修改成功！");
    }


    @Test
    public void testDelete(){
        int id = 5;
        userDao.delete(id);

    }


    @Test
    public void testQueryAll(){
        List<User> users = userDao.queryAll();
        if(users != null){
            for(int i = 0; i < users.size(); i++){
                System.out.println(users.get(i));
            }
        }
    }
}
