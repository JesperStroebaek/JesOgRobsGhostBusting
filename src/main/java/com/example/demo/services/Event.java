package com.example.demo.services;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Event {
    private String eventinput;
    private String firstName;
    private String lastName;
    private String date;
    private String einfo;

    // constructer.
    public Event(String einfo, String firstName, String lastName, String date, String eventinput)
    {
        this.einfo = einfo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.date = date;
        this.eventinput = eventinput;

    }

    // Method Getter.
    public String getEinfo(){ return einfo; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getDate() { return date; }
    public String getEventinput() { return eventinput;}


}
