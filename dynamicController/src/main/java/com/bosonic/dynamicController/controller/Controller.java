package com.bosonic.dynamicController.controller;

import com.bosonic.dynamicController.application.ServiceControllerObject;
import com.bosonic.dynamicController.domain.ControllerObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private ServiceControllerObject sc;

    @GetMapping(value={"*","{path}","{path}/{path2}"})
    public ControllerObject entryOther(@PathVariable(required = false) String path, @PathVariable (required = false) String path2,
                                                       @RequestParam (required = false) String nombre,
                                                       @RequestParam (required = false) String ciudad) {

        return sc.returnPath(path, path2, nombre, ciudad);
    }

    @GetMapping(value={"/","one"})
    public String entryOne(){

        return "You has passed to entryOne zone";

    }
}
