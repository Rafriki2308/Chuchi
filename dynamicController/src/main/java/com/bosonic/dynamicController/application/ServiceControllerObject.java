package com.bosonic.dynamicController.application;

import com.bosonic.dynamicController.domain.ControllerObject;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ServiceControllerObject {

    public static ControllerObject controllerObject = new ControllerObject();

    public ControllerObject returnPath(String path, String path2, Map<String, String> query,
                                       Map<String, String> header) {

        if (path != null) {
            controllerObject.addPath(path);
        }
        if (path2 != null) {
            controllerObject.addPath(path2);
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
