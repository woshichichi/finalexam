package com.example.exam.controller;

import com.example.exam.entity.Newsinfo;
import com.example.exam.entity.Topic;
import com.example.exam.service.INewsinfoService;
import com.example.exam.service.ITopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
public class TopicController {
    @Autowired
    ITopicService topicService;
    @Autowired
    INewsinfoService newsinfoService;

    @RequestMapping("/index")
    public String test2(Model model){
//        int tid = 1;
        List<Topic> topics = topicService.findAllTopic();
        List<Newsinfo> newsinfos = newsinfoService.findAllNewsinfo();
//        List<Topic> tops = newsinfoService.findByName(tid);
//        model.addAttribute("tops", tops);
//        System.out.println(newsinfos);
        model.addAttribute("topics", topics);
        model.addAttribute("newsinfos", newsinfos);
        return "index";
    }
    @RequestMapping("/query")
    public String test3(int nid, Model model){
        Newsinfo newsinfo;
        List<Topic> topics = topicService.findAllTopic();
        List<Newsinfo> newsinfos = newsinfoService.findAllNewsinfo();
        newsinfo=newsinfoService.findbyid(nid);
        model.addAttribute("topics", topics);
        model.addAttribute("newsinfos", newsinfos);
        model.addAttribute("newsinfo", newsinfo);
         return "view";
    }
    @GetMapping("/delete/{nid}")
    public Object delete(@PathVariable int nid){
        newsinfoService.deleteNewsById(nid);
        return "redirect:/index";
    }

    @GetMapping("/modify/{nid}")
    public String goupdate(@PathVariable int nid,Model model){
        Newsinfo newsinfo;
        List<Topic> topics = topicService.findAllTopic();
        List<Newsinfo> newsinfos = newsinfoService.findAllNewsinfo();
        newsinfo=newsinfoService.findbyid(nid);
        model.addAttribute("topics", topics);
        model.addAttribute("newsinfos", newsinfos);
        model.addAttribute("newsinfo", newsinfo);
        return "modify";
    }

    @PostMapping("/update")
    public  String  updater(Newsinfo newsinfo){
        int update = newsinfoService.update(newsinfo);
        return "redirect:/index";
    }


}
