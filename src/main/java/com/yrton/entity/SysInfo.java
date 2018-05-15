package com.yrton.entity;

import org.springframework.stereotype.Component;

/**
 * @Author: whmyit@163.com
 * @Description: 系统参数
 * @Date: Created in 14:56  2018/3/29
 */
public class SysInfo {

    private Integer id;
    private String email;
    private Integer phone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "SysInfo{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                '}';
    }
}
