package dao;

/*
 *
 *@Author  liu
 *@Creat Time   2021/6/11  13:42
 *@System Data  2021 06
 *
 */


import org.apache.ibatis.annotations.Select;
import pojo.Customer;

import java.util.List;
import java.util.Map;

public interface CustomerMapper {

 //根据id查询单个用户
 public Customer queryForOne(Integer id);

 //分页操作
 public List<Customer> pageList(Map<String,Integer> map);
 //分页操作
 public List<Customer> pageList2();
}
