package ie.atu.auth_process_test;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LogController {
    @PostMapping
    public String makeLogIn(Person person){
        return "Log In  Microservice has been called";
    }
}
