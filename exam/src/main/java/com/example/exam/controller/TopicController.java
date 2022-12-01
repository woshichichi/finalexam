package com.example.exam.controller;

import com.example.exam.entity.Topic;
import com.example.exam.service.ITopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
public class TopicController {
    @Autowired
    ITopicService topicService;

    @RequestMapping("/home")
    public String test2(Model model){
        List<Topic> topics = topicService.findAllTopic();
        model.addAttribute("topics", topics);
        return "home";
    }
}
