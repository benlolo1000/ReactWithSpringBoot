package com.restservicecors;

public class HelloWorld {
    private long id;
    private String content;
    private String[] contentArr;

    public HelloWorld() {
        this.id = -1;
        this.content = "";
        this.contentArr = new String[]{};
    }

    public HelloWorld(long id, String content, String[] contentArr) {
        this.id = id;
        this.content = content;
        this.contentArr = contentArr;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String[] getContentArr() {
        return contentArr;
    }
}
