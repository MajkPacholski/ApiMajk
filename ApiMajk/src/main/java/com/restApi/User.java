package com.restApi;

import javax.persistence.*;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private Integer age;
    private String profession;


    public User() {
    }

    public User(Long id, String name, Integer age, String profession) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public User(String name, Integer age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
