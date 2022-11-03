package com.bosonic.dynamicController.controller;

import com.bosonic.dynamicController.application.ServiceControllerObject;
import com.bosonic.dynamicController.domain.ControllerObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private ServiceControllerObject sc;

    @GetMapping("")
    public String entryOther() {
        return "You has passed to entryOther zone";
    }

    @GetMapping(value={"/","one"})
    public String entryOne(){

        return "You has passed to entryOne zone";

    }
}
