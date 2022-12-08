package com.example.ji.controller;

import com.example.ji.entity.Newsinfo;
import com.example.ji.entity.Topic;
import com.example.ji.service.INewsService;
import com.example.ji.service.ITopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
public class PageController {
    @Autowired
    ITopicService topicService;
    @Autowired
    INewsService newsinfoService;

    /**
     * Index
     * @param model
     * @return
     */
    @RequestMapping("/index")
    public String first(Model model){
        List<Topic> topics = topicService.findAllTopic();
        List<Newsinfo> newsinfos = newsinfoService.findAllNewsinfo();
        model.addAttribute("topics", topics);
        model.addAttribute("newsinfos", newsinfos);
        return "index";
    }

    /**
     * Query
     * @param nid
     * @param model
     * @return
     */
    @RequestMapping("/query")
    public String second(int nid, Model model){
        Newsinfo newsinfo;
        List<Topic> topics = topicService.findAllTopic();
        List<Newsinfo> newsinfos = newsinfoService.findAllNewsinfo();
        newsinfo=newsinfoService.findbyid(nid);
        model.addAttribute("topics", topics);
        model.addAttribute("newsinfos", newsinfos);
        model.addAttribute("newsinfo", newsinfo);
         return "view";
    }

    /**
     * Delete
     * @param nid
     * @return
     */
    @GetMapping("/delete/{nid}")
    public Object delete(@PathVariable int nid){
        newsinfoService.deleteNewsById(nid);
        return "redirect:/index";
    }

    /**
     * Modify
     * @param nid
     * @param model
     * @return
     */
    @GetMapping("/modify/{nid}")
    public String updateing(@PathVariable int nid,Model model){
        Newsinfo newsinfo;
        List<Topic> topics = topicService.findAllTopic();
        List<Newsinfo> newsinfos = newsinfoService.findAllNewsinfo();
        newsinfo=newsinfoService.findbyid(nid);
        model.addAttribute("topics", topics);
        model.addAttribute("newsinfos", newsinfos);
        model.addAttribute("newsinfo", newsinfo);
        return "modify";
    }

    /**
     * Update
     * @param newsinfo
     * @return
     */
    @PostMapping("/update")
    public  String  fifth(Newsinfo newsinfo){
        int update = newsinfoService.update(newsinfo);
        return "redirect:/index";
    }


}
