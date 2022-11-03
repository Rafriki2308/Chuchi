package com.bosonic.dynamicController.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@Data
public class ControllerObject {

    private static List<String> paths;
    private static List<Map> headers;

}
