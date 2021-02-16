package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class FormExample {
    @GetMapping(value = "/form-test")
    public String renderForm() {
        return "form";
    }

    @GetMapping(value="/list")
    @ResponseBody
    public ArrayList renderList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("test");
        list.add("orange");

        // This list gets returned as json!
        return list;
    }
}
