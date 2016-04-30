package main.com.jabgibson.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bgibson on 4/30/16.
 */

@RestController
@RequestMapping("/")
public class HomeController {

    @RequestMapping("/")
    public String getHome() {
        return "Hello Freaking Dang World 2!";
    }
}
