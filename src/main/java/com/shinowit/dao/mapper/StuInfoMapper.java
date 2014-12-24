package com.shinowit.dao.mapper;

import com.shinowit.entity.StuInfo;
import com.shinowit.entity.StuInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StuInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stu_info
     *
     * @mbggenerated Tue Dec 23 21:08:23 CST 2014
     */
    int countByExample(StuInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stu_info
     *
     * @mbggenerated Tue Dec 23 21:08:23 CST 2014
     */
    int deleteByExample(StuInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stu_info
     *
     * @mbggenerated Tue Dec 23 21:08:23 CST 2014
     */
    int deleteByPrimaryKey(Integer stuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stu_info
     *
     * @mbggenerated Tue Dec 23 21:08:23 CST 2014
     */
    int insert(StuInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stu_info
     *
     * @mbggenerated Tue Dec 23 21:08:23 CST 2014
     */
    int insertSelective(StuInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stu_info
     *
     * @mbggenerated Tue Dec 23 21:08:23 CST 2014
     */
    List<StuInfo> selectByExample(StuInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stu_info
     *
     * @mbggenerated Tue Dec 23 21:08:23 CST 2014
     */
    StuInfo selectByPrimaryKey(Integer stuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stu_info
     *
     * @mbggenerated Tue Dec 23 21:08:23 CST 2014
     */
    int updateByExampleSelective(@Param("record") StuInfo record, @Param("example") StuInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stu_info
     *
     * @mbggenerated Tue Dec 23 21:08:23 CST 2014
     */
    int updateByExample(@Param("record") StuInfo record, @Param("example") StuInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stu_info
     *
     * @mbggenerated Tue Dec 23 21:08:23 CST 2014
     */
    int updateByPrimaryKeySelective(StuInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stu_info
     *
     * @mbggenerated Tue Dec 23 21:08:23 CST 2014
     */
    int updateByPrimaryKey(StuInfo record);

    List<StuInfo> selectPage(StuInfoExample example);

    Integer selectMaxPrimaryKeyValue();
}