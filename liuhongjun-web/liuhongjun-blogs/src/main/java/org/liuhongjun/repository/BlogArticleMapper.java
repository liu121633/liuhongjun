package org.liuhongjun.repository;

import java.util.List;
import org.liuhongjun.domain.dao.BlogArticle;
import org.liuhongjun.domain.dao.BlogArticleExample;

public interface BlogArticleMapper {
    int countByExample(BlogArticleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BlogArticle record);

    List<BlogArticle> selectByExampleWithBLOBs(BlogArticleExample example);

    List<BlogArticle> selectByExample(BlogArticleExample example);

    BlogArticle selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BlogArticle record);

    int updateByPrimaryKeyWithBLOBs(BlogArticle record);

    int updateByPrimaryKey(BlogArticle record);
}