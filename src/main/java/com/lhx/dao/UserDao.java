package com.lhx.dao;

import com.lhx.model.User;

import java.util.List;

/**
 * Created by lhx on 14-12-22 下午1:59
 *
 * @project springmybatis2
 * @package com.lhx.dao
 * @blog http://blog.csdn.net/u011439289
 * @email 888xin@sina.com
 * @Description
 */
public interface UserDao {
    public User queryById(int id);

    public void save(User u);

    public void update(User u);

    public void delete(Integer id);

    public List<User> queryAll();
}
