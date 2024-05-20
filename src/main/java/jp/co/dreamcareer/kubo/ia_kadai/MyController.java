package jp.co.dreamcareer.kubo.ia_kadai;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/")
    public String getSample() {
        return "index";
    }
}
