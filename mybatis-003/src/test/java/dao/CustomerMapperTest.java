package dao;

/*
 *
 *@Author  liu
 *@Creat Time   2021/6/12  16:15
 *@System Data  2021 06
 *
 */


import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;
import pojo.Customer;
import utils.MybatisUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerMapperTest {

 private static Logger logger = Logger.getLogger(CustomerMapperTest.class);
 @Test
    public void testQueryForOneById() {
     SqlSession sqlSession = MybatisUtils.getSqlSession();
     CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);
     logger.warn("sqlSession警告！");
     Customer customer = mapper.queryForOne(2);
     System.out.println(customer);
     sqlSession.close();

 }

 @Test
 public void testLog4j()  {

  logger.info("logger:进入了log4j的info");
  logger.warn("logger:进入了log4j的warn");
  logger.error("logger:进入了log4j的error");
  logger.debug("logger:进入了log4j的debug");
 }


 @Test
 public void testPageList()  {
  SqlSession sqlSession = MybatisUtils.getSqlSession();
  CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);
  Map<String,Integer> map = new HashMap<>();
  map.put("startIndex",0);
  map.put("pageSize",2);
  List<Customer> customers = mapper.pageList(map);
  System.out.println(customers);
  sqlSession.close();
 }

 @Test
 public void testRowBounds() {
  RowBounds rowBounds = new RowBounds(1, 2);
  SqlSession sqlSession = MybatisUtils.getSqlSession();
  List<Customer> customers = sqlSession.selectList("dao.CustomerMapper.pageList2",null,rowBounds);
  for (Customer customer : customers) {
   System.out.println(customer);
  }
  sqlSession.close();
 }
























 }
