package top.continew.admin.news.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Data
@Setter
public class ArticleDO {
    private Long articleId;
    private String articleTitle;
    private String articleMain;
    private String articleCoverUrl;
    private String articleAbstract;
    private Long articleStarCount;
    private Long userId;
    private Long categoryId;
    private Long isOfficial;
    private Long isNoname;
    private Date createTime;
    private Date modifyTime;
}
