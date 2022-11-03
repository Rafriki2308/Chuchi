package com.bosonic.dynamicController.controller;

import com.bosonic.dynamicController.application.ServiceControllerObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;


@RestController
public class Controller {

    @Autowired
    private ServiceControllerObject sc;

    @GetMapping(value = {"*", "{path}", "{path}/{path2}"})
    public Object entryOther(@PathVariable(required = false) String path,
                             @PathVariable(required = false) String path2,
                             @RequestParam(required = false) Map<String, String> query,
                             @RequestHeader(required = false) Map<String, String> header,
                             @RequestBody (required = false) String body,
                             HttpServletRequest request,
                             ServletResponse response) {

        if (request.getHeader("REDIRIGE") != null && request.getHeader("REDIRIGE").equals("SALTA")) {
            return new ModelAndView("redirect:/salta");
        }

        if(request.getHeader("ADD") != null && body != null){
            return body + " modificado";
        }

        return sc.returnPath(path, path2, query, header);
    }

    @GetMapping(value = {"/", "one"})
    public String entryOne() {

        return "You has passed to entryOne zone";

    }

    @GetMapping(value = {"/salta"})
    public String entryJump() {

        return "You ask me for jump, I jump";

    }
}
