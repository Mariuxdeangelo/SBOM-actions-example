package org.mariuxdeangelo.sbomGithubActionExample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestService {

    @GetMapping("helloWorld")
    public String helloFunction() {
        return "Hello World";
    }
}