package pojo;

/*
 *
 *@Author  liu
 *@Creat Time   2021/6/13  20:38
 *@System Data  2021 06
 *
 */


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
 private int teacherid;
 private String name;
 private List<Student> students;
}
