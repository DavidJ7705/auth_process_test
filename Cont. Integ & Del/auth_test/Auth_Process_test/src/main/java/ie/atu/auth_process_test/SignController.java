package ie.atu.auth_process_test;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/signup")
public class SignController {

    @PostMapping
    public String makeSignUp(Person person){
        return "Sign Up Microservice has been called";
    }
}
