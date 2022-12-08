package com.example.ji.service.impl;

import com.example.ji.dao.ITopicDao;
import com.example.ji.entity.Topic;
import com.example.ji.service.ITopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicServiceImpl implements ITopicService {
    @Autowired
    private ITopicDao topicDao;

    @Override
    public List<Topic> findAllTopic() {
        return topicDao.findAll();
    }
}
