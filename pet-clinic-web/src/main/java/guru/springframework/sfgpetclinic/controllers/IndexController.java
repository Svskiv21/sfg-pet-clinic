package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping(value = {"", "/","index", "index.html"})
    // when request comes to root context of root/index or index.html it all gonna match the request mapping
    public String index(){
        return "index";
    } //  it is going to look back and go to index.html
}
