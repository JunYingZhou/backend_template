package top.continew.admin.news.mapper;


import org.apache.ibatis.annotations.Mapper;
import top.continew.admin.news.model.ArticleDO;
import top.continew.admin.news.model.NewsDO;
import top.continew.starter.data.mp.base.BaseMapper;

import java.util.List;

@Mapper

public interface ArticleMapper extends BaseMapper<ArticleDO> {

    List<ArticleDO> getAllArticle();
}
