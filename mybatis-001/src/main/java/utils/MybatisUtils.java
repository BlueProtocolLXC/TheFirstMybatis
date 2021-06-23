package utils;

/*
 *
 *@Author  liu
 *@Creat Time   2021/6/10  15:28
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

 private static SqlSessionFactory  sqlSessionFactory = null;
 private static InputStream inputStream = null;

 static{
  //String 的地址直接在resources下？
  String resource = "mybatis-config.xml";
  try {
   inputStream = Resources.getResourceAsStream(resource);
  } catch (IOException e) {
   e.printStackTrace();
  }
   sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

 }


 public static SqlSession getSqlSession() {
  return sqlSessionFactory.openSession();
 }



}
