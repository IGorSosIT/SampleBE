package ch.igs.junobe;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(
        origins = {
                "http://localhost:4200",
                "http://127.0.0.1:4200",
        })
@RestController
@RequestMapping("api/v1/juno")
public class JunoController {

    @GetMapping
    public ResponseEntity<JunoDto> getHelloJuno(){
        return ResponseEntity.ok(new JunoDto("Hello Fabian, from BE!"));
    }


}
