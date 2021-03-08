package com.example.demo.services;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Event {
    private String eventinput;
    private String fname;
    private String lname;
    private String date;
    private String einfo;

    // constructer.
    public Event(String einfo, String fname, String lname, String date, String eventinput)
    {
        this.einfo = einfo;
        this.fname = fname;
        this.lname = lname;
        this.date = date;
        this.eventinput = eventinput;

    }

    // Method Getter.
    public String getEinfo(){ return einfo; }
    public String getFirstName() { return fname; }
    public String getLastName() { return lname; }
    public String getDate() { return date; }
    public String getEventinput() { return eventinput;}


}
