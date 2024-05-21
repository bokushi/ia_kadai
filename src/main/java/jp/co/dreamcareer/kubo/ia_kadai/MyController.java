package jp.co.dreamcareer.kubo.ia_kadai;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {
    @GetMapping("/")
    public String getSample(Model model) {
        model.addAttribute("form", new Forms());
        return "index";
    }

    @PostMapping("/result")
    public String getResult(@Validated @ModelAttribute("form") Forms form, BindingResult bindingResult, Model model) {
        model.addAttribute("form", form);
        System.out.println(form.getCourse());
        System.out.println(form.getFeedback());
        return "result";
    }

}
