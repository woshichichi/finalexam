package com.example.exam.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "topic")
public class Topic {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer tid;
    private String name;

}
