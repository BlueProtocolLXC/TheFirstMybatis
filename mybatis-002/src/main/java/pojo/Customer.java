package pojo;

/*
 *
 *@Author  liu
 *@Creat Time   2021/6/11  13:34
 *@System Data  2021 06
 *
 */

import org.apache.ibatis.type.Alias;
//用注解给这个类起一个别名
@Alias("customer")
public class Customer {
 private Integer id;
 private String customerName;
 private String customerPassword;

 public Customer() {
 }

 public Customer(Integer id, String customerName, String customerPassword) {
  this.id = id;
  this.customerName = customerName;
  this.customerPassword = customerPassword;
 }

 public Integer getId() {
  return id;
 }

 public void setId(Integer id) {
  this.id = id;
 }

 public String getCustomerName() {
  return customerName;
 }

 public void setCustomerName(String customerName) {
  this.customerName = customerName;
 }

 public String getCustomerPassword() {
  return customerPassword;
 }

 public void setCustomerPassword(String customerPassword) {
  this.customerPassword = customerPassword;
 }

 @Override
 public String toString() {
  return "Customer{" +
          "id=" + id +
          ", customerName='" + customerName + '\'' +
          ", customerPassword='" + customerPassword + '\'' +
          '}';
 }
}
