package dao;

/*
 *
 *@Author  liu
 *@Creat Time   2021/6/11  14:10
 *@System Data  2021 06
 *
 */


import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Customer;
import utils.MybatisUtils;

import java.util.List;

public class CustomerMapperTest {
 @Test
 public void testQueryForList() {
  SqlSession sqlSession = MybatisUtils.getSqlSession();
  CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
  List<Customer> customers = customerMapper.queryForList();
  for (Customer customer : customers) {
   System.out.println(customer);
  }
  sqlSession.close();
 }
}
