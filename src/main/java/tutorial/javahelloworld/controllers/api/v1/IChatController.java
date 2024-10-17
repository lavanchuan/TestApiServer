package tutorial.javahelloworld.controllers.api.v1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface IChatController {

    @GetMapping("/app-name")
    ResponseEntity<?> getAppName();

    @GetMapping("/get")
    ResponseEntity<?> get();

    @GetMapping("/get/{message}")
    ResponseEntity<?> get(@PathVariable("message") String message);
}
