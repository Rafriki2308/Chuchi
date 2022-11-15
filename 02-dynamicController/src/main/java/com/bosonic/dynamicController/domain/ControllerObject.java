package com.bosonic.dynamicController.domain;

import lombok.Data;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Data
public class ControllerObject {

    private List<String> paths;
    private Map<String, String> querys;

    private Map<String, String> headers;

    public ControllerObject() {
        paths = new ArrayList<>();
        querys = new HashMap<String, String>();
        headers = new HashMap<String, String>();
    }

    public List<String> getPaths() {
        return paths;
    }

    public Map<String, String> getQuerys() {
        return querys;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void addPath(List<String> paths) {
        this.paths.addAll(paths);
    }

    public void addQuery(Map query) {
        querys.putAll(query);
    }

    public void addHeader(Map header) {
        headers.putAll(header);
    }


}
