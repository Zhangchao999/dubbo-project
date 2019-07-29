package cn.geoary.bean;

import java.io.Serializable;

public class User implements Serializable {
    // id
    private String id;
    // 姓名
    private String name;
    // 地址
    private String address;
    // 年龄
    private Integer age;
    // 备注
    private String remarks;

    public User() {
    }

    public User(String id, String name, String address, Integer age, String remarks) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.remarks = remarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
