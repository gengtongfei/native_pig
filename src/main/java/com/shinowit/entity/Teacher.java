package com.shinowit.entity;

import java.io.Serializable;

public class Teacher implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.teacher_id
     *
     * @mbggenerated Mon Sep 05 11:22:41 CST 2016
     */
    private Integer teacherId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.teacher_name
     *
     * @mbggenerated Mon Sep 05 11:22:41 CST 2016
     */
    private String teacherName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table teacher
     *
     * @mbggenerated Mon Sep 05 11:22:41 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.teacher_id
     *
     * @return the value of teacher.teacher_id
     * @mbggenerated Mon Sep 05 11:22:41 CST 2016
     */
    public Integer getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.teacher_id
     *
     * @param teacherId the value for teacher.teacher_id
     * @mbggenerated Mon Sep 05 11:22:41 CST 2016
     */
    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.teacher_name
     *
     * @return the value of teacher.teacher_name
     * @mbggenerated Mon Sep 05 11:22:41 CST 2016
     */
    public String getTeacherName() {
        return teacherName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.teacher_name
     *
     * @param teacherName the value for teacher.teacher_name
     * @mbggenerated Mon Sep 05 11:22:41 CST 2016
     */
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbggenerated Mon Sep 05 11:22:41 CST 2016
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Teacher other = (Teacher) that;
        return (this.getTeacherId() == null ? other.getTeacherId() == null : this.getTeacherId().equals(other.getTeacherId()))
                && (this.getTeacherName() == null ? other.getTeacherName() == null : this.getTeacherName().equals(other.getTeacherName()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbggenerated Mon Sep 05 11:22:41 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTeacherId() == null) ? 0 : getTeacherId().hashCode());
        result = prime * result + ((getTeacherName() == null) ? 0 : getTeacherName().hashCode());
        return result;
    }
}