package com.example.serv;

/**
 * Created by Agneev on 22-04-2016.
 */
import com.example.server.vo.Content;

public class App {
    public static void main(String[] args) {

        System.out.println("Sending POST to GCM");

        String apiKey = "AIzaSyBI56eSACUP_gOou3DuvVMjB_qz5PsKjRo";
        Content content = createContent();

        Post2Gcm.post(apiKey, content);
    }

    public static Content createContent() {
        Content c = new Content();

        c.addRegId("APA91bEIoDxXBFnF8namYD3bTolYhpYmymfNHMEl9xGfMCoJPQz4vQttsI7sQFIodgYv6O4w84bhnSWBh9ZcXJiWmrLRFY4gDvH9cZiNIBhyYGAv8nt_gEj8hn_r2UU05JbmxV9Q7yK2");

        c.createData("Working!!!", "Test message");

        return c;
    }
}

