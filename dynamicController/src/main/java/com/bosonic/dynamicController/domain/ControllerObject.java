package com.bosonic.dynamicController.domain;

import lombok.Data;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Data
public class ControllerObject {

    private List<String> paths;
    private Map <String, String> headers;

    public ControllerObject(){
        paths= new ArrayList<>();
        headers = new HashMap<String, String>();
    }

    public  List<String> getPaths() {
        return paths;
    }

    public Map<String, String> getHeaders(){
        return headers;
    }

    public void addPath(String path){
        paths.add(path);

    }
    public void addHeader(String key1, String key2){
        headers.put(key1, key2);
    }


}
