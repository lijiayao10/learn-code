package com.cc.learncode.config.client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@RefreshScope
@RestController
public class ConfigClientRest {

    private String from;

    @RequestMapping("/from")
    public String getfrom() {
        return this.from;
    }

    @RequestMapping(path = "/from1", method = { RequestMethod.POST })
    public String getfrom(@RequestParam(name = "str") String str) {
        return str;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

}
