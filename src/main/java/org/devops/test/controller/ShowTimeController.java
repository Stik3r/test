package org.devops.test.controller;

import org.devops.test.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class ShowTimeController {

    @Autowired
    MainService mainService;

    @GetMapping(path = "savetime")
    @ResponseBody
    public String getSaveTime(){
        try {
            return mainService.getSaveTime();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
