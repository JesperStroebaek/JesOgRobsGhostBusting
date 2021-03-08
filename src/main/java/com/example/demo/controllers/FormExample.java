package com.example.demo.controllers;

import com.example.demo.services.Event;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class FormExample {
    public String TemplateInputException(final String message, final String templateName, final Throwable cause) {
        final String s = message + templateName + cause;
        return s;
    }
    ArrayList<Event> eventList = new ArrayList<>();

    @GetMapping("/") // @GetMapping tager imod en getrequest fra browseren.
    public String index()
    {
        return "index"; // index er den html fil der returneres.
    }

    @GetMapping("/form") // createWeekendEvents er den html fil der returneres (get).
    public String weekendEventMethod()
    {
        return "form";
    }

    @PostMapping("/signUp")
    public String signUp(@RequestParam("einfo") String einfo, @RequestParam("fname") String fname, @RequestParam("lname") String lname,@RequestParam("date") String date, @RequestParam("eventinput") String eventinput)
    {
       Event eventlist = new Event(einfo, fname, lname, date, eventinput);
        eventList.add(eventlist);
        return "redirect:/succes";
    }

    @GetMapping("/succes")
    public String succes(Model model)
    {
        model.addAttribute("event", eventList.get(eventList.size()-1));
        return "succes";
    }

    @GetMapping("/overview")
    public String overview(Model model)
    {
        model.addAttribute("events", eventList);
        return "overview";
    }








    //--------------------------------------------------------------------------
    /* Showing how to create a form using thymeleaf
    @GetMapping(value = "/")
    public String renderForm() {
        return "form";
    }

    @PostMapping(value = "/list")
    public String input()
    {
    return "list";
    }
    @GetMapping("/list")
    public String renderList()
    {

        return "list";

        /*
        ArrayList<String> mylist = new ArrayList<>();
        mylist.add(renderForm(form.fname));
        mylist.add("orange");
        return mylist + (RequestParam(fname);
    }

     */

}


