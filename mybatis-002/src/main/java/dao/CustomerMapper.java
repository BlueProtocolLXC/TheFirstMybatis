package dao;

/*
 *
 *@Author  liu
 *@Creat Time   2021/6/11  13:42
 *@System Data  2021 06
 *
 */


import pojo.Customer;

import java.util.List;
import java.util.Map;

public interface CustomerMapper {
 //查询多个客户
 public List<Customer> queryForList();
 //根据id查询单个用户
 public Customer queryForOne(Integer id);
 //根据id删除单个用户
 public Integer deleteOne(Integer id);
 //插入一个客户
 public int addOneCustomer(Customer customer);
 //根据id更新一个客户信息
 public int updateCustomerById(Map<String,Object> map);
 //根据一个字符查询用户信息
 public Customer queryForStr(String str);
}
