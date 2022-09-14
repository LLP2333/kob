package com.kob.backebd.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/pk/")
public class BotInfoController {
    @RequestMapping("/getbotinfo")
    public Map<String, String> getBotInfo() {
        Map<String,String > test=new HashMap<>();
        test.put("张三","两岁");
        test.put("李四","三岁");
        return test;
    }
}
