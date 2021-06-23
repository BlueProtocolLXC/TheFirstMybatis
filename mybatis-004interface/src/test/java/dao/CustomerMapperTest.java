package dao;

/*
 *
 *@Author  liu
 *@Creat Time   2021/6/13  16:44
 *@System Data  2021 06
 *
 */


import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Customer;
import utils.MybatisUtils;

public class CustomerMapperTest {
 @Test
 public void testQueryForOne() {
  SqlSession sqlSession = MybatisUtils.getSqlSession();
  CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);
  Integer integer = mapper.deleteForOne(5);
  if(integer>0) {
   System.out.println("修改成功");
  }
  sqlSession.close();
 }
}
