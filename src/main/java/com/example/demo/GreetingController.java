package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class GreetingController {

  @GetMapping("/")
  public String index() {
    return "index";
  }

  @PostMapping("/greet")
  public String greet(@RequestParam("name") String name, Model model) {
    model.addAttribute("name", name);
    return "greeting";
  }
}
