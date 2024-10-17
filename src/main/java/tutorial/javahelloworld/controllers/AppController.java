package tutorial.javahelloworld.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class AppController {

    public String index(){
        return "index";
    }
}
