package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class FormExample {
    // Showing how to create a form using thymeleaf
    @GetMapping(value = "/")
    public String renderForm() {
        return "form";
    }

    @GetMapping(value="/list")
    @ResponseBody
    public ArrayList list() {
        ArrayList<String> mylist = new ArrayList<>();
        mylist.add("peel my");
        mylist.add("orange");

        return mylist;
    }
}


