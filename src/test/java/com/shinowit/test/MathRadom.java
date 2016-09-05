package com.shinowit.test;

import com.github.pagehelper.PageHelper;
import com.shinowit.dao.mapper.TeacherMapper;
import com.shinowit.entity.Teacher;
import com.shinowit.entity.TeacherExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2015/1/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-context.xml"})
public class MathRadom {

    @Resource
    private TeacherMapper teacherMapper;

    @Test
    public void query() {
        //VehicleExample vehicleExample=new VehicleExample();
        //VehicleExample.Criteria criteria=vehicleExample.createCriteria();
        //criteria.andTypeEqualTo("car");
        //Vehicle car=vehicleMapper.selectByPrimaryKey(2);
        //Assert.assertTrue(car.getClass().getName().equals("com.shinowit.entity.Car"));
        //Student student=studentMapper.selectByPrimaryKey(11);
        //System.out.println(student.getTeacher().getTeacherName());
       /* Teacher teacher=teacherMapper.selectByPrimaryKey(1);
        List<Student> studentList=teacher.getStudentList();
        for(Student student:studentList){
            System.out.println(student.getName());
        }*/
        /*List<Student> studentList =studentMapper.selectStudentWithTeahcerByPrimaryKey(11);
        for(Student stu:studentList){
            System.out.println(stu.getTeacherName());
        }
        studentList.hashCode();*/
        //Student student=studentMapper.selectByPrimaryKey(11);
        /*MybatisRedisCache mybatisRedisCache=new MybatisRedisCache("11");
        mybatisRedisCache.removeObject("-1405854076:3133417846:com.shinowit.dao.mapper.StudentMapper.selectByPrimaryKey:0:2147483647:select \n" +
                "     \n" +
                "    \n" +
                "    ID, NAME, BRANCH, PERCENTAGE, PHONE, EMAIL, address_id, teacher_id\n" +
                "   \n" +
                "    from student\n" +
                "    where ID = ?:11");*/
        //System.out.println(student.getName());
        TeacherExample teacherExample = new TeacherExample();
        TeacherExample.Criteria criteria = teacherExample.createCriteria();
        criteria.andTeacherIdIsNotNull();
        PageHelper.startPage(1, 1);
        List<Teacher> teacherList = teacherMapper.selectByExample(teacherExample);
        for (Teacher teacher : teacherList) {
            System.out.println(teacher.getTeacherName());
        }

    }

}
