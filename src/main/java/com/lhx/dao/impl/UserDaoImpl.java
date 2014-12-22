package com.lhx.dao.impl;

import com.lhx.dao.UserDao;
import com.lhx.model.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* Created by lhx on 14-12-22 下午2:00
*
* @project springmybatis2
* @package com.lhx.dao.impl
* @blog http://blog.csdn.net/u011439289
* @email 888xin@sina.com
* @Description
*/
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public User queryById(int id) {
        return (User) sqlSessionTemplate.selectOne("queryById", 3);
    }

    @Override
    public void save(User u) {
        sqlSessionTemplate.insert("insert-user", u);
    }

    @Override
    public void update(User u) {
        sqlSessionTemplate.update("update-user", u);
    }

    @Override
    public void delete(Integer id) {
        sqlSessionTemplate.delete("delete-user",id);
    }

    @Override
    public List<User> queryAll() {
        List<User> users = sqlSessionTemplate.selectList("queryAll");
        return users;
    }
}
