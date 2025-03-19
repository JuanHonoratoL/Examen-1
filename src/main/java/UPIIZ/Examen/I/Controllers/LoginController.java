package UPIIZ.Examen.I.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping
    public String Login() {
        return "login";
    }
}
