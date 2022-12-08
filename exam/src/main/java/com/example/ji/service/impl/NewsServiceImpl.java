package com.example.ji.service.impl;

import com.example.ji.dao.INewsDao;
import com.example.ji.entity.Newsinfo;
import com.example.ji.mapper.NewsMapper;
import com.example.ji.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements INewsService {
    @Autowired
    private INewsDao newsinfo;

    @Autowired
    private NewsMapper newsMapper;

    @Override
    public List<Newsinfo> findAllNewsinfo() {
        return newsinfo.findAll();
    }

    @Override
    public Newsinfo findbyid(int nid) {
        return newsMapper.getOne(nid);
    }

    @Override
    public int deleteNewsById(int nid) {
        return newsMapper.deleteNewsById(nid);
    }

    @Override
    public int update(Newsinfo newsinfo) {
        return newsMapper.update(newsinfo);
    }


}
