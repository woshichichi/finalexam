package com.example.exam.service.impl;

import com.example.exam.dao.ITopicDao;
import com.example.exam.entity.Topic;
import com.example.exam.mapper.NewsinfoMapper;
import com.example.exam.service.ITopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicServiceImpl implements ITopicService {
    @Autowired
    private ITopicDao topicDao;
    @Autowired
    private NewsinfoMapper topicMapper;

    @Override
    public List<Topic> findAllTopic() {
        return topicDao.findAll();
    }

//    @Override
//    public Topic getOne(int tid) {
//        return topicMapper.getOne(tid);
//    }

//    @Override
//    public String findtopic() {
//        return null;
//    }
}
