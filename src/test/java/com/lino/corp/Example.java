package com.lino.corp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.svenson.JSONParser;

public class Example {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        parser.addTypeHint(".Example1[]", Example1.class);
        String json = "{" + "\"Example\": [" + "{" + "\"foo\": \"a1\","
                + "\"bar\": \"b1\"," + "\"fubar\": \"c1\"" + "}," + "{"
                + "\"foo\": \"a2\"," + "\"bar\": \"b2\"," + "\"fubar\": \"c2\""
                + "}," + "{" + "\"foo\": \"a3\"," + "\"bar\": \"b3\","
                + "\"fubar\": \"c3\"" + "}" + "]" + "}\"";
       
        
    }
}

 class Example1 {
    private String foo;
    private String bar;
    private String fubar;
    public Example1(){}
    public void setFoo(String foo) {
        this.foo = foo;
    }
    public String getFoo() {
        return foo;
    }
    public void setBar(String bar) {
        this.bar = bar;
    }
    public String getBar() {
        return bar;
    }
    public void setFubar(String fubar) {
        this.fubar = fubar;
    }
    public String getFubar() {
        return fubar;
    }
}