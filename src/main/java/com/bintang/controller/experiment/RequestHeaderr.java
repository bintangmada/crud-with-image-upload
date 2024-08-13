package com.bintang.controller.experiment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.Map;

@RestController
@RequestMapping("/header")
public class RequestHeaderr {

    @GetMapping()
    public String getHeader(@RequestHeader Map<String, String> headerMap){
        System.out.println("header : "+headerMap);
        return "sukses";
    }

}
