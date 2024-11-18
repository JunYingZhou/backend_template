package top.continew.admin.news.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.continew.admin.news.model.ArticleDO;
import top.continew.admin.news.service.ArticleService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/anti/article")
public class ArticleController {

    private final ArticleService articleService;

    @GetMapping("/list")
    public List<ArticleDO> getArticleList() {
        return articleService.getAllArticle();
    }

}
