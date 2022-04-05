package com.aut.mybatis.pojo;

public class user {
    private int id;

    private String name;

    private String age;

    private String sex;

    private String email;

    public user() {
    }

    public user(int id, String name, String age, String sex, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
