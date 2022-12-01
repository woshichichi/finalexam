package com.example.exam.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "newsinfo")
public class Newsinfo {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer nid;
    private String title;
    private Date createDate;
    private String author;
    private String content;
    private Integer tid;
}
