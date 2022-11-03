package com.bosonic.dynamicController.controller;

import com.bosonic.dynamicController.application.ServiceControllerObject;
import com.bosonic.dynamicController.domain.ControllerObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class Controller {

    @Autowired
    private ServiceControllerObject sc;

    @GetMapping(value = {"*", "{path}", "{path}/{path2}"})
    public ControllerObject entryOther(@PathVariable(required = false) String path,
                                       @PathVariable(required = false) String path2,
                                       @RequestParam(required = false) Map<String, String> query,
                                       @RequestHeader (required = false) Map<String, String> header) {

        return sc.returnPath(path, path2, query, header);
    }

    @GetMapping(value = {"/", "one"})
    public String entryOne() {

        return "You has passed to entryOne zone";

    }
}
