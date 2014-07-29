package com.pandachat.video.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Alex on 7/29/14.
 */
@Controller
@RequestMapping("/")
public class ChatController {

    @RequestMapping("/chat")
    public String helloWorld(Model model) {
        return "chat";
    }
}
