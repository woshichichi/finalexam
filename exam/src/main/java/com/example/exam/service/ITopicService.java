package com.example.exam.service;

import com.example.exam.entity.Topic;

import java.util.List;

public interface ITopicService {
    List<Topic> findAllTopic();

    String findtopic();
}
