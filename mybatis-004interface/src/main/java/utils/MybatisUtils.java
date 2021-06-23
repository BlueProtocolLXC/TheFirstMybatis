package utils;/*
 *
 *@Author  liu
 *@Creat Time   2021/6/11  13:28
 *@System Data  2021 06
 *
 */


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtils {
 private static SqlSessionFactory sqlSessionFactory = null;
 static{
     String resource = "mybatis-config.xml";
  InputStream inputStream = null;
  try {
   inputStream = Resources.getResourceAsStream(resource);
  } catch (IOException e) {
   e.printStackTrace();
  }
  sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

 }

 public static SqlSession getSqlSession() {
  //可以设置sqlSession的自动提交
  return sqlSessionFactory.openSession(true);
 }

}
