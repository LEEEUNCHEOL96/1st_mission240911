package com.example.mission.Article;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ArticleService {
    private final ArticleRepository articleRepository;

    public List<Article> getList(){
        return this.articleRepository.findAll();
    }

    public Article getList(Integer id) {
        Optional<Article> optionalArticle = this.articleRepository.findById(id);
        if(optionalArticle.isEmpty()){
            return null;
        }else {
            return optionalArticle.get();
        }
    }
}
