package com.example.exam.mapper;

import com.example.exam.entity.Newsinfo;
import com.example.exam.entity.Topic;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface NewsinfoMapper {
    @Select("select * from newsinfo where nid = #{nid}")
    public Newsinfo getOne(int nid);  //根据id获取一条新闻类别

    public int deleteNewsById(int nid);
}
