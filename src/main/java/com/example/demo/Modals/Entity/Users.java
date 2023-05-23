package com.example.demo.Modals.Entity;

import javax.persistence.*;

@Entity
@Table(name = "tt_user_table_test")
public class Users {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

}
