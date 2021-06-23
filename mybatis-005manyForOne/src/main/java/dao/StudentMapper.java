package dao;

/*
 *
 *@Author  liu
 *@Creat Time   2021/6/13  20:40
 *@System Data  2021 06
 *
 */


import pojo.Student;

import java.util.List;

public interface StudentMapper {
 //查询所有的学生包括老师的信息
 public List<Student> queryForListStu1();


 //查询所有的学生包括老师的信息
 public List<Student> queryForListStu2();
}
