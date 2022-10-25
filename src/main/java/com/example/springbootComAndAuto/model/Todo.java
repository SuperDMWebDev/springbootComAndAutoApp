package com.example.springbootComAndAuto.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="todo")
@Data
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="title")
    private String title;

    @Column(name="detail")
    private String detail;

}
