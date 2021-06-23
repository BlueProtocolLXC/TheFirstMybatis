package pojo;

/*
 *
 *@Author  liu
 *@Creat Time   2021/6/11  13:34
 *@System Data  2021 06
 *
 */


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
 private Integer id;
 private String customerName;
 private String psw;


}
