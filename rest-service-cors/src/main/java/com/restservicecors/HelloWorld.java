package com.restservicecors;

public class HelloWorld {
    private long id;
    private String content;

    public HelloWorld() {
        this.id = -1;
        this.content = "";
    }

    public HelloWorld(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
