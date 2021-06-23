package dao;

/*
 *
 *@Author  liu
 *@Creat Time   2021/6/13  20:39
 *@System Data  2021 06
 *
 */


import pojo.Student;
import pojo.Teacher;

import java.util.List;

public interface TeacherMapper {
    //查询所有的学生包括老师的信息
    public List<Teacher> queryForListTea();
}
