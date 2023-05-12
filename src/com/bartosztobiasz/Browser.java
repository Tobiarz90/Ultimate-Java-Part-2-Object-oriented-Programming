package com.bartosztobiasz;

public class Browser {
    public void navigate(String address) {
        String ip = findIpAddress(address);
        String html = sendHttpRequest(ip);
        System.out.println(html);
    }

    // unnecessary details => make method private -> abstraction
    private String sendHttpRequest(String ip) {
        return "<html></html>";
    }

    // unnecessary details => make method private -> abstraction
    private String findIpAddress(
            String address
            // boolean cache => new parameter doesn't affect Main class -> reduce coupling
    ) {
        return "127.0.0.1";
    }
}
