package dao;

/*
 *
 *@Author  liu
 *@Creat Time   2021/6/10  16:15
 *@System Data  2021 06
 *
 */


import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.User;
import utils.MybatisUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDAOTest {
@Test
 public void testUserDAO() {
  SqlSession sqlSession = MybatisUtils.getSqlSession();
 //方式一：推荐
 UserDAO mapper = sqlSession.getMapper(UserDAO.class);
 List<User> users = mapper.queryUserForList();
 //方式二：不推荐
 //List<User> users = sqlSession.selectList("dao.UserDAO.queryUserForList");
 for (User user : users)
   System.out.println(user);
 sqlSession.close();
  }


  @Test
  public void testGetUserById() {
   Integer integer = Integer.valueOf(3);
   SqlSession sqlSession = MybatisUtils.getSqlSession();
   UserDAO mapper = sqlSession.getMapper(UserDAO.class);
   User userById = mapper.getUserById(integer);
   System.out.println(userById);
   sqlSession.close();

  }
  @Test
 public void testInsertUser() {
   SqlSession sqlSession = MybatisUtils.getSqlSession();
   UserDAO mapper = sqlSession.getMapper(UserDAO.class);
   Integer intValue = mapper.insertUser(new User(4, "晓月", "123456"));
   sqlSession.commit();
   System.out.println(intValue);
   sqlSession.close();
  }

  @Test
 public void testUpdateUser() {
   SqlSession sqlSession = MybatisUtils.getSqlSession();
   UserDAO userMapper = sqlSession.getMapper(UserDAO.class);
   userMapper.updateUser(new User(4,"黄丽","123456"));
   sqlSession.commit();
   sqlSession.close();
  }
  @Test
 public void testDeleteById()
  {
   SqlSession sqlSession = MybatisUtils.getSqlSession();
   UserDAO mapper = sqlSession.getMapper(UserDAO.class);
   mapper.deleteById(Integer.valueOf(4));
   sqlSession.commit();
   sqlSession.close();
  }
  @Test
    public void testMap() {
      SqlSession sqlSession = MybatisUtils.getSqlSession();
      UserDAO mapper = sqlSession.getMapper(UserDAO.class);
      Map<String,Object> map = new HashMap<>();
      map.put("id",2);
      map.put("setId",4);
      map.put("username","刘向");
      map.put("password","123789");
      mapper.updateUserMap(map);
      sqlSession.commit();
      sqlSession.close();
  }
    @Test
    public void testqueryByLike()
    {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDAO mapper = sqlSession.getMapper(UserDAO.class);
        List<User> users = mapper.getUserLike("刘");
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
