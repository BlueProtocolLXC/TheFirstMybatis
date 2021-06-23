package pojo;

/*
 *
 *@Author  liu
 *@Creat Time   2021/6/11  13:34
 *@System Data  2021 06
 *
 */



public class Customer {
 private Integer id;
 private String customerName;
 private String psw;

 public Customer() {
 }

 public Customer(Integer id, String customerName, String psw) {
  this.id = id;
  this.customerName = customerName;
  this.psw = psw;
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

 public String getPsw() {
  return psw;
 }

 public void setPsw(String psw) {
  this.psw = psw;
 }

 @Override
 public String toString() {
  return "Customer{" +
          "id=" + id +
          ", customerName='" + customerName + '\'' +
          ", psw='" + psw + '\'' +
          '}';
 }
}
