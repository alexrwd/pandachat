package com.pandachat.video.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(ModelMap model) {
        return "login";
    }
}
