package com.damahou.oa.dao;

/**
 * @Program HelloWorld
 * @ClassName User
 * @Package com.damahou.oa.dao
 * @Description TODO：用户实体
 * @Author DaMaHou
 * @CreateDate 2022-03-23 23:41
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class User {
    /**
     * 用户名
     */
    private String userName;
    /**
     * 用户年龄
     */
    private int age;

    /**
     * 空参构造
     */
    public User() {
    }

    /**
     * 全参构造
     * @param userName
     * @param age
     */
    public User(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }
}
