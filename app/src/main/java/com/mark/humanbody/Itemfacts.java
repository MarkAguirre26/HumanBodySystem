package com.mark.humanbody;

/**
 * Created by Mark on 2/19/2017.
 */

public class Itemfacts {

    String Header,Content;


    public Itemfacts(String Header, String Content) {
       this.Header = Header;
        this.Content = Content;
    }

    public String getHeader() {
        return Header;
    }

    public String getContent() {
        return Content;
    }
}