package com.google.training.helloworld;

public class HelloClass {
    public String message = "Hello World";

    public HelloClass () {
    }

    public HelloClass (String name) {
        this.message = "Hello " + name + "!";
    }
    
    // add code for assignment one in Lesson 2
    public HelloClass (String name, String period) {
    	this.message = "Good " + period + " " + name + "!";
    }

    public String getMessage() {
        return message;
    }
}
