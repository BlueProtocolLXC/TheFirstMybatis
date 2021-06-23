package dao;

/*
 *
 *@Author  liu
 *@Creat Time   2021/6/11  13:42
 *@System Data  2021 06
 *
 */


import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import pojo.Customer;

import java.util.List;
import java.util.Map;

public interface CustomerMapper {
 //根据id查询一个客户
 @Select("select * from mybatis.customer where id = #{uid}")
 public Customer queryForOne(@Param("uid")Integer id);
 //关于@Param的使用：
 //0.多个参数必须加上
 //1.如果参数有基本数据类型或者String类型时，需要加上
 //2.引用类型不需要加
 //3.如果参数只有一个基本数据类型，可以不加，但建议加
 //4.我们在Sql中引用的就是我们在@Param("uid")这里中设置的属性名


 //根据id修改客户信息
 @Update("update mybatis.customer set id=#{id},customername=#{customerName},customerpassword=#{psw} where id=#{id}")
 public Integer updateById(Customer customer);

 //添加一个记录
 @Update("insert into mybatis.customer (id,customername,customerpassword) values(#{id},#{customerName},#{psw})")
 public Integer addForOne(Customer customer);

 //根据id删除一个客户
 @Delete("delete from mybatis.customer where id = #{kid}")
 public Integer deleteForOne(@Param("kid")Integer id);

}
