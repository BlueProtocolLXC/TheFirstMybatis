package dao;

/*
 *
 *@Author  liu
 *@Creat Time   2021/6/13  21:03
 *@System Data  2021 06
 *
 */


import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Student;
import utils.MybatisUtils;

import java.util.List;
import java.util.Map;

public class StudentMapperTest {

    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.queryForListStu2();
        for (Student student : students) {

            System.out.println(student);
        }

        sqlSession.close();
    }
}
