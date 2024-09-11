package com.example.mission.Article;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/article")
@Controller
public class ArticleController {

    private final ArticleService articleService;

    @GetMapping("/list")
    public String list (Model model){
        List<Article> articleList = this.articleService.getList();
        model.addAttribute("articleList",articleList);

        return "article_list";
    }

    @GetMapping(value = "/detail/{id}")
    public String detail(Model model, @PathVariable("id") Integer id){
        Article article = this.articleService.getList(id);
        model.addAttribute("article",article);

        return "article_detail";
    }

    @GetMapping("/create")
    @ResponseBody
    public String create(){
        return "article_detail";
    }
    
    @PostMapping("/create")
    public String create(@RequestParam(value = "title") String title,
                         @RequestParam(value = "content") String content){
        this.articleService.create(title, content);
        return "redirect:/article/list";
    }

}
