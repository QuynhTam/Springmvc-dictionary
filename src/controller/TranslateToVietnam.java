package controller;

import model.Dictionary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.DictionaryService;

import java.util.List;

@Controller
public class TranslateToVietnam {
    DictionaryService dictionaryService = new DictionaryService();

    @GetMapping("/search")
    public String search() {
        return "home";
    }

    @PostMapping("/result")
    public String meaning(@RequestParam String word, Model model) {
        List<Dictionary> dictionaries = dictionaryService.findAll();
        for (int i = 0; i < dictionaries.size(); i++) {
            if (word.equalsIgnoreCase(dictionaries.get(i).getVi())) {
                model.addAttribute("key", dictionaries.get(i).getEn());
                model.addAttribute("word", dictionaries.get(i).getVi());
            }
        }
        return "mean";
    }
}
