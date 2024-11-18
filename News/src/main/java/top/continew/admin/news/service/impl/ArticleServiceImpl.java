package top.continew.admin.news.service.impl;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import top.continew.admin.news.mapper.ArticleMapper;
import top.continew.admin.news.model.ArticleDO;
import top.continew.admin.news.service.ArticleService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {

    private final ArticleMapper articleMapper;

    @Override
    public List<ArticleDO> getAllArticle() {
        List<ArticleDO> articleDOList = articleMapper.getAllArticle();
        System.out.println("articleDOList = " + articleDOList);
        return articleDOList;
    }
}
