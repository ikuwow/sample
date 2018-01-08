package ikuwow.todoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ListController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

}
