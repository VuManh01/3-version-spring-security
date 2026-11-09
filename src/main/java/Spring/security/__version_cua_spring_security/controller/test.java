package Spring.security.__version_cua_spring_security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class test {

    @GetMapping("/security")
    public ResponseEntity<String> getInformation(){
        return ResponseEntity.ok("Done");
    }

}
