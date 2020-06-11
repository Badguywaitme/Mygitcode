package com.shier.bolg.web;

import com.shier.bolg.MyNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class IndexController {
    @GetMapping(value = "/{id}/{name}")
    public String index(@PathVariable Integer id, @PathVariable String name) {
//        int i=9/0;
//        String bolg = null;
//        if (bolg == null) {
//            throw new MyNotFoundException();
//        }
        System.out.println("------index------");
        return "index";
    }
}
