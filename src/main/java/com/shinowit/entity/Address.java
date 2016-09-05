package com.shinowit.entity;

import java.io.Serializable;

public class Address implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.id
     *
     * @mbggenerated Mon Sep 05 11:22:41 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.name
     *
     * @mbggenerated Mon Sep 05 11:22:41 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.post_code
     *
     * @mbggenerated Mon Sep 05 11:22:41 CST 2016
     */
    private String postCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table address
     *
     * @mbggenerated Mon Sep 05 11:22:41 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.id
     *
     * @return the value of address.id
     * @mbggenerated Mon Sep 05 11:22:41 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address.id
     *
     * @param id the value for address.id
     * @mbggenerated Mon Sep 05 11:22:41 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.name
     *
     * @return the value of address.name
     * @mbggenerated Mon Sep 05 11:22:41 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address.name
     *
     * @param name the value for address.name
     * @mbggenerated Mon Sep 05 11:22:41 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.post_code
     *
     * @return the value of address.post_code
     * @mbggenerated Mon Sep 05 11:22:41 CST 2016
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address.post_code
     *
     * @param postCode the value for address.post_code
     * @mbggenerated Mon Sep 05 11:22:41 CST 2016
     */
    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
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
        Address other = (Address) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
                && (this.getPostCode() == null ? other.getPostCode() == null : this.getPostCode().equals(other.getPostCode()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Mon Sep 05 11:22:41 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPostCode() == null) ? 0 : getPostCode().hashCode());
        return result;
    }
}