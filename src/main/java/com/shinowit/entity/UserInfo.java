package com.shinowit.entity;

import java.io.Serializable;

public class UserInfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_id
     *
     * @mbggenerated Tue Dec 23 12:15:19 CST 2014
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_name
     *
     * @mbggenerated Tue Dec 23 12:15:19 CST 2014
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_pass
     *
     * @mbggenerated Tue Dec 23 12:15:19 CST 2014
     */
    private String userPass;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.age
     *
     * @mbggenerated Tue Dec 23 12:15:19 CST 2014
     */
    private Integer age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_info
     *
     * @mbggenerated Tue Dec 23 12:15:19 CST 2014
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_id
     *
     * @return the value of user_info.user_id
     *
     * @mbggenerated Tue Dec 23 12:15:19 CST 2014
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_id
     *
     * @param userId the value for user_info.user_id
     *
     * @mbggenerated Tue Dec 23 12:15:19 CST 2014
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_name
     *
     * @return the value of user_info.user_name
     *
     * @mbggenerated Tue Dec 23 12:15:19 CST 2014
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_name
     *
     * @param userName the value for user_info.user_name
     *
     * @mbggenerated Tue Dec 23 12:15:19 CST 2014
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_pass
     *
     * @return the value of user_info.user_pass
     *
     * @mbggenerated Tue Dec 23 12:15:19 CST 2014
     */
    public String getUserPass() {
        return userPass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_pass
     *
     * @param userPass the value for user_info.user_pass
     *
     * @mbggenerated Tue Dec 23 12:15:19 CST 2014
     */
    public void setUserPass(String userPass) {
        this.userPass = userPass == null ? null : userPass.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.age
     *
     * @return the value of user_info.age
     *
     * @mbggenerated Tue Dec 23 12:15:19 CST 2014
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.age
     *
     * @param age the value for user_info.age
     *
     * @mbggenerated Tue Dec 23 12:15:19 CST 2014
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Tue Dec 23 12:15:19 CST 2014
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
        UserInfo other = (UserInfo) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserPass() == null ? other.getUserPass() == null : this.getUserPass().equals(other.getUserPass()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Tue Dec 23 12:15:19 CST 2014
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserPass() == null) ? 0 : getUserPass().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        return result;
    }
}