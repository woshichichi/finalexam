package com.example.ji.entity;
import com.fasterxml.jackson.annotation.JsonFormat;
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
    private Date createdate;
    private String author;
    private String content;
    private Integer tid;
    private String namen;

}
