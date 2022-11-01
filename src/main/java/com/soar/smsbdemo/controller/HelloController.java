package com.soar.smsbdemo.controller;

import com.soar.smsbdemo.dto.ParamDTO;
import com.soar.smsbdemo.utils.StringToListPropertyEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;


@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/test/_bulk")
    public String test(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("test %s!", name);
    }

    @GetMapping("/hello1")
    public ParamDTO hello1(ParamDTO params) {
        System.out.println("+++++++++++++++++++++++++");
        return params;
    }

    @InitBinder
    public void initBinderXX(WebDataBinder binder) {
        binder.registerCustomEditor(String[].class, new StringToListPropertyEditor());
    }
}
