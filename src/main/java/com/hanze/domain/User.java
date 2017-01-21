package com.hanze.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Hanze on 21/01/2017.
 */
@Entity
public class User implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
