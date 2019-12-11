package com.baizhi.entity;

public class d_department {
    private Integer id;
    private Integer numbers;
    private String department;

    @Override
    public String toString() {
        return "d_department{" +
                "id=" + id +
                ", number=" + numbers +
                ", department='" + department + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer numbers) {
        this.numbers = numbers;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public d_department() {
    }

    public d_department(Integer id, Integer numbers, String department) {
        this.id = id;
        this.numbers = numbers;
        this.department = department;
    }
}
