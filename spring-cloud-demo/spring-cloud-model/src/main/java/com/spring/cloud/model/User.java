package com.spring.cloud.model;

import java.util.UUID;

/**
 * @author czg
 * @date 2019/6/23
 */
public class User {
    private Long id;
    private String name = UUID.randomUUID().toString();

    public User() {
    }

    public User(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
