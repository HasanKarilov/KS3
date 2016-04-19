package com.springapp.mvc.domain;

import javax.validation.constraints.Size;

/**
 * Created by hanaria on 2/12/16.
 */
public class User {
   @Size(min = 5, message = "name have to be larger 5 symbols")
    private String name;

    @Size(min = 5, max = 10, message = "password have to be between 5 and 10")
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
