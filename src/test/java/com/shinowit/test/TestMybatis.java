package com.shinowit.test;

import com.shinowit.dao.mapper.StuInfoMapper;
import com.shinowit.entity.StuInfo;
import com.shinowit.entity.StuInfoCriteria;
import com.shinowit.entity.UserInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-context.xml"})
public class TestMybatis extends AbstractJUnit4SpringContextTests {

    @Resource
    private StuInfoMapper stu_dao;

    @Test
    public void test1() {

        //查询
        StuInfoCriteria criteria = new StuInfoCriteria();
        StuInfoCriteria.Criteria tiaojian = criteria.createCriteria();
        tiaojian.andStuIdLessThanOrEqualTo(5);
        List<StuInfo> stulist = stu_dao.selectByExample(criteria);
        for (StuInfo stu : stulist) {
            System.out.print(stu.getStuName());
        }
        //删除
//        int i=stu_dao.deleteByPrimaryKey(3);
//        Assert.assertTrue(1==i);

        //更新
//        StuInfo stu=stu_dao.selectByPrimaryKey(4);
//        stu.setStuName("abc");
//        int i=stu_dao.updateByPrimaryKey(stu);
//        System.out.print(i);
//        Assert.assertTrue(i==1);

        //新增
//        StuInfo stu=new StuInfo();
//        stu.setStuName("aab");
//        stu.setStuPass("123");
//        stu.setStuSex("man");
//        stu_dao.insert(stu);
//        Integer id=stu.getStuId();
//        System.out.print(id);
//        Assert.assertTrue(id>0);
    }

}
