package com.example.exam.dao;

import com.example.exam.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ITopicDao extends JpaRepository<Topic, Integer> {
    List<Topic> findAll();
}
