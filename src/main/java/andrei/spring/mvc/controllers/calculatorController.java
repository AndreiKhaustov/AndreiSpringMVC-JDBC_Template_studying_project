package andrei.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class calculatorController {
    @GetMapping("/calc")
    public String getCalculator(@RequestParam(value = "a", required = false) int a, @RequestParam(value = "b",required = false) int b, @RequestParam(value = "action",required = false) String action, Model model){
        int result = 0;
        switch (action) {
            case "multiplication" -> result = a*b;
                case "addition" -> result = a+b;
                    case "subtraction"-> result = a -b;
                        case "division" -> result = a/b;
        }
        model.addAttribute("result", result);
       return "calc";
    }
}
