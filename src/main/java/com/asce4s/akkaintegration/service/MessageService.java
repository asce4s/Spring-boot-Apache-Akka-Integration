package com.asce4s.akkaintegration.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public void print(String msg){
        System.out.println(msg);
    }
}
