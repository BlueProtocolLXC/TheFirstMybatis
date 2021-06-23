package dao;

/*
 *
 *@Author  liu
 *@Creat Time   2021/6/10  15:46
 *@System Data  2021 06
 *
 */


import pojo.User;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface UserDAO {
 //查询全部的记录
 public List<User> queryUserForList();
 //根据id查询用户
 public User getUserById(Integer id);
 //插入一条语句
 public Integer insertUser(User user);
 //修改一条记录
 public Integer updateUser(User user);
 //删除一条记录
 public Integer deleteById(Integer id);
 //删除一条记录（万能的map版）
 public Integer updateUserMap(Map<String, Object> map);
 //模糊查询
 public List<User> getUserLike(String str);
}
