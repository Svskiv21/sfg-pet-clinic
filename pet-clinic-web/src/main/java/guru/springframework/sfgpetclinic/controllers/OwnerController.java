package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping(value = {"/owners", "owners/index", "owners/index.html"})
    public String listOwners(Model model){

        model.addAttribute("owners", ownerService.findAll()); // that gives us a set that will be able to iterate over
        return "owners/index";
    }

    @RequestMapping("/find2")
    public String findOwners(){
        return "notimplemented";
    }
}
