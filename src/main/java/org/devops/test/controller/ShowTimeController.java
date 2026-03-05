package org.devops.test.controller;

import org.devops.test.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ShowTimeController {

    @Autowired
    MainService mainService;

    @GetMapping(path = "savetime")
    public String getSaveTime(){
        return mainService.getSaveTime();
    }
}
