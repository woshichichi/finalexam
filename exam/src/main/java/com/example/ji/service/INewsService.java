package com.example.ji.service;

import com.example.ji.entity.Newsinfo;


import java.util.List;

public interface INewsService {
    List<Newsinfo> findAllNewsinfo();

    Newsinfo findbyid(int nid);

    public int deleteNewsById(int nid);

    public int update(Newsinfo newsinfo);
}
