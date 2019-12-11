package com.baizhi.entity;

public class d_user {
    private Integer id;
    private String names;
    private Double salary;
    private Integer age;
    private Integer did;
    private d_department dd;
    private String src;

    @Override
    public String toString() {
        return "d_user{" +
                "id=" + id +
                ", names='" + names + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", did=" + did +
                ", dd=" + dd +
                ", src='" + src + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public d_department getDd() {
        return dd;
    }

    public void setDd(d_department dd) {
        this.dd = dd;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public d_user() {
    }

    public d_user(Integer id, String names, Double salary, Integer age, Integer did, String src) {
        this.id = id;
        this.names = names;
        this.salary = salary;
        this.age = age;
        this.did = did;
        this.src = src;
    }

    public d_user(Integer id, String names, Double salary, Integer age, Integer did, d_department dd, String src) {
        this.id = id;
        this.names = names;
        this.salary = salary;
        this.age = age;
        this.did = did;
        this.dd = dd;
        this.src = src;
    }
}
