package pojo;

/*
 *
 *@Author  liu
 *@Creat Time   2021/6/13  20:37
 *@System Data  2021 06
 *
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
 private int sid;
 private String name;
 private Teacher teacher;
}
