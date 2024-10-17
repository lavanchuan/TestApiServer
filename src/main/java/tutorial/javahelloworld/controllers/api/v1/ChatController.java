package tutorial.javahelloworld.controllers.api.v1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class ChatController implements IChatController{

    private String appName = "JavaHelloworld";

    @Override
    public ResponseEntity<?> getAppName() {
        return ResponseEntity.ok(Map.of("app-name", appName));
    }

    @Override
    public ResponseEntity<?> get() {
        return ResponseEntity.ok(Map.of("message", "xin chao"));
    }

    @Override
    public ResponseEntity<?> get(String message) {
        return ResponseEntity.ok(Map.of("message", message));
    }
}
