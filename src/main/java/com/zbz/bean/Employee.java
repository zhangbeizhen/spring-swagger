package com.zbz.bean;

import java.io.Serializable;

/**
 * @author: ag
 * @date: 2019/3/14 9:47
 */

public class Employee implements Serializable {
    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;
    private String cardNumber;
    /** 岗位 */
    private String post;
    /** 数据库字段: department_id 开启驼峰命名后可以自动匹配*/
    private Integer departmentId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }
}
