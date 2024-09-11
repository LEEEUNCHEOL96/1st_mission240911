package com.example.mission;

import com.example.mission.Article.Article;
import com.example.mission.Article.ArticleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class MissionApplicationTests {

	@Autowired
	private ArticleRepository articleRepository;

	@Test
	void contextLoads() {
		Article a = new Article();
		a.setTitle("테스트용");
		a.setContent("지문입니다.");
		a.setCreateDate(LocalDateTime.now());
		this.articleRepository.save(a);

	}


}
