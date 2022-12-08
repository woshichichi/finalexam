package com.example.exam.service;

import com.example.exam.entity.Newsinfo;
import com.example.exam.entity.Topic;

import java.util.List;

public interface INewsinfoService {
    List<Newsinfo> findAllNewsinfo();

    Newsinfo findbyid(int nid);

    public int deleteNewsById(int nid);

    public int update(Newsinfo newsinfo);
}
