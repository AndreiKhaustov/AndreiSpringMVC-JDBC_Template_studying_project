package andrei.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class FirstController {
@GetMapping("/getPage")
    public String getPage(@RequestParam(value = "name", required = false)String name, @RequestParam(value = "surname", required = false)String surname, Model model) {
 model.addAttribute("message", name + " " + surname);
//    System.out.println(name + " " + surname);
return "first/getPage";
}
@GetMapping("/welcome")
public String welcomePage(){
return "first/welcome";
}
}
