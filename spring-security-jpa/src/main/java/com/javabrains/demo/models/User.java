package com.javabrains.demo.models;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="User")
@Getter
@Setter
public class User {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String userName;
    private String passWord;
    private boolean active;
    private String roles;
}
