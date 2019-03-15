package cn.itcast.service;

import cn.itcast.domain.PageBean;
import cn.itcast.domain.User;

import java.util.List;
import java.util.Map;

/**
 * 用户管理的业务接口
 */
public interface UserService {

    /**
     * 查询所有用户信息
     * @return
     */
    public List<User> findAll();

    User login(User user);

    void addUser(User user);

    void delete(String id);

    User findUserById(String id);

    void uptateUser(User user);

    void delSelectedUser(String[] uids);

    PageBean<User> findUserByPage(String currentPage, String rows, Map<String, String[]> condition);

}
