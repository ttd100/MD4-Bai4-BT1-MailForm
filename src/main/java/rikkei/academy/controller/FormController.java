package rikkei.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import rikkei.academy.model.Form;
import rikkei.academy.service.FormService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FormController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("form", FormService.getForm());
        return "index";
    }

    @GetMapping("/setting")
    public String setting(Model model) {
        model.addAttribute("languageList", languages());
        model.addAttribute("pageSize", pageSize());
        model.addAttribute("form", FormService.getForm());
        return "setting";
    }

    @PostMapping("/setting")
    public String update(@ModelAttribute("form") Form form) {
        System.out.println("EDit: " + form);
        FormService.updateForm(form);
        return "redirect:/";
    }

    public List<String> languages() {
        List<String> languages = new ArrayList<>();
        languages.add("English");
        languages.add("Vietnamese");
        languages.add("Japanese");
        languages.add("Chinese");
        return languages;
    }

    public List<Integer> pageSize() {
        List<Integer> pageSize = new ArrayList<>();
        pageSize.add(5);
        pageSize.add(10);
        pageSize.add(15);
        pageSize.add(25);
        pageSize.add(50);
        pageSize.add(100);
        return pageSize;
    }
}