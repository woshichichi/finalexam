package com.example.ji.dao;

import com.example.ji.entity.Newsinfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface INewsinfo extends JpaRepository<Newsinfo, Integer> {
    List<Newsinfo> findAll();
}
