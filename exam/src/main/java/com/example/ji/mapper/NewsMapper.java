package com.example.ji.mapper;

import com.example.ji.entity.Newsinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;



@Mapper
@Repository
public interface NewsMapper {
    @Select("select * from newsinfo where nid = #{nid}")
    public Newsinfo getOne(int nid);

    public int deleteNewsById(int nid);

    public int update(Newsinfo newsinfo);
}
