package dao;

/*
 *
 *@Author  liu
 *@Creat Time   2021/6/13  20:39
 *@System Data  2021 06
 *
 */


import org.apache.ibatis.annotations.Param;
import pojo.Teacher;

import java.util.List;

public interface TeacherMapper {
    //根据老师的id查出指定老师下的所有学生
    public Teacher teacherStu(@Param("uid")int id);


    //根据老师的id查出指定老师下的所有学生
    public Teacher teacherStu2(@Param("uid")int id);
}
