package matei.spring.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/owners")
public class OwnerController {

    @RequestMapping(path = {"", "/", "/index", "/index.html"})
    public String listOwners(){
        return "owners/index";
    }
}
