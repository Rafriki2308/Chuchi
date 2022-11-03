package com.bosonic.dynamicController.application;

import com.bosonic.dynamicController.domain.ControllerObject;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ServiceControllerObject {

    public static ControllerObject controllerObject = new ControllerObject();
    public ControllerObject returnPath(String path, String path2, String nombre, String ciudad){

        if(path!=null){
            controllerObject.addPath(path);
        }
        if(path2!=null){
            controllerObject.addPath(path2);
        }

        if(nombre!=null){
            controllerObject.addHeader("nombre", nombre);
        }

        if(ciudad!=null){
            controllerObject.addHeader("ciudad", ciudad);
        }

        return controllerObject;
    }
}
