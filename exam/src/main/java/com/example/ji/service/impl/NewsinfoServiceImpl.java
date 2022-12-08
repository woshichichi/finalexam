package com.example.ji.service.impl;

import com.example.ji.dao.INewsinfo;
import com.example.ji.entity.Newsinfo;
import com.example.ji.mapper.NewsinfoMapper;
import com.example.ji.service.INewsinfoService;
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

    @Override
    public int deleteNewsById(int nid) {
        return newsinfoMapper.deleteNewsById(nid);
    }

    @Override
    public int update(Newsinfo newsinfo) {
        return newsinfoMapper.update(newsinfo);
    }


}
