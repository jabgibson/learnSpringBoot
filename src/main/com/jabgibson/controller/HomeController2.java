package main.com.jabgibson.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bgibson on 4/30/16.
 */

@RestController
@RequestMapping("/boom")
public class HomeController2 {

    @RequestMapping("/")
    public String getHome() {
        return "Boom to the world";
    }
}
