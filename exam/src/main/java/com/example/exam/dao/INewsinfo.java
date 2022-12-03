package com.example.exam.dao;

import com.example.exam.entity.Newsinfo;
import com.example.exam.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface INewsinfo extends JpaRepository<Newsinfo, Integer> {
    List<Newsinfo> findAll();
}
