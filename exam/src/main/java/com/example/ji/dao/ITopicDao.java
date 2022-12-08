package com.example.ji.dao;

import com.example.ji.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ITopicDao extends JpaRepository<Topic, Integer> {
    List<Topic> findAll();
}
