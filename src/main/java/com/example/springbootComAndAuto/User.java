package com.example.springbootComAndAuto;

import lombok.Data;
import lombok.Generated;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="User")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="hp")
    private int hp;

    @Column(name="stamina")
    private int stamina;

    private int atk;
    private int def;
    private int agi;

}
