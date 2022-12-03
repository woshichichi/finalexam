package com.example.exam.service.impl;

import com.example.exam.dao.INewsinfo;
import com.example.exam.dao.ITopicDao;
import com.example.exam.entity.Newsinfo;
import com.example.exam.entity.Topic;
import com.example.exam.mapper.NewsinfoMapper;
import com.example.exam.service.INewsinfoService;
import com.example.exam.service.ITopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsinfoServiceImpl implements INewsinfoService {
    @Autowired
    private INewsinfo newsinfo;

    @Autowired
    private NewsinfoMapper newsinfoMapper;

    @Override
    public List<Newsinfo> findAllNewsinfo() {
        return newsinfo.findAll();
    }

    @Override
    public Newsinfo findbyid(int nid) {
        return newsinfoMapper.getOne(nid);
    }


}
