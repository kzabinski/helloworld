package com.kzabinski.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

@RestController
public class HostName {
    InetAddress ip;

    @GetMapping(value = "/hostname")
    public String getHostname() {
        return ip.getHostName();
    }
}
