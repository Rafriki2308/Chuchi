package com.bosonic.dynamicController.application;

import com.bosonic.dynamicController.domain.ControllerObject;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
public class ServiceControllerObject {

    public static ControllerObject controllerObject = new ControllerObject();

    public ControllerObject returnPath(Map<String, String> query,
                                       Map<String, String> header, HttpServletRequest request) {

        if (request.getRequestURI() != null) {
            //List<String> paths = new ArrayList<>();
            //String[] pathsArray = request.getRequestURI().split("/");
            List<String> paths = new ArrayList<String>(Arrays.asList(request.getRequestURI().split("/")));
            //paths = Arrays.asList(pathsArray);
            paths.remove(0);
            controllerObject.addPath(paths);
        }

        if (query != null) {
            controllerObject.addQuery(query);
        }

        if (header != null) {
            controllerObject.addHeader(header);
        }
        return controllerObject;
    }
}
