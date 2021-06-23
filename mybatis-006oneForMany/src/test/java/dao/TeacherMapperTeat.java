package dao;

/*
 *
 *@Author  liu
 *@Creat Time   2021/6/14  19:58
 *@System Data  2021 06
 *
 */


import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Teacher;
import utils.MybatisUtils;

import java.util.List;
import java.util.Scanner;

public class TeacherMapperTeat {
 @Test
 public void test() {
  SqlSession sqlSession = MybatisUtils.getSqlSession();
  TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
  Teacher teacher1 = mapper.teacherStu(1);
  System.out.println(teacher1);
  sqlSession.close();
 }


 @Test
 public void test2() {
  SqlSession sqlSession = MybatisUtils.getSqlSession();
  TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
  Teacher teacher = mapper.teacherStu2(1);
  System.out.println(teacher);
  sqlSession.close();
 }

 public static void main(String[] args) {
  int[] ints = new int[3];
  int sum=0;
  Scanner scanner = new Scanner(System.in);
  for (int i = 0; i < 3; i++) {
   ints[i]=scanner.nextInt();
  }

  for (int i = 0; i < 3; i++) {
   sum+=ints[i];
  }
  System.out.println(sum);
 }
 @Test
 public void test11() {


 }
}
