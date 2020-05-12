package pl.edu.wszib.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pl.edu.wszib.dao.ParameterDao;

@Controller
public class ParameterController {

    @Autowired
    private ParameterDao parameterDao;

    @GetMapping
    public String start() {
        return "welcome";
    }

    @GetMapping("stats")
    public String stats() {
        return "stats";
        }

    @GetMapping("food")
    public String food() {
        return "food";
    }

/*    @GetMapping("habits")
    public String habits() {
        return "habits";
    }*/

    @GetMapping("healthdata")
    public String healthdata() {
        return "healthdata";
    }

    @GetMapping("ratings")
    public String ratings() {
        return "ratings";
    }

    @GetMapping("settings")
    public String settings() {
        return "settings";
    }


}

