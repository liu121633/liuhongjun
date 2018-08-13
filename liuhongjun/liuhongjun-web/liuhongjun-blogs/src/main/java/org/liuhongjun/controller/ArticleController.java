package org.liuhongjun.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.liuhongjun.data.ApiRequestVo;
import org.liuhongjun.domain.dao.BlogArticle;
import org.liuhongjun.repository.BlogArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("article")
public class ArticleController {

    @Autowired
    private BlogArticleMapper articleMapper;
    @Autowired
    private HttpServletRequest request;

    @PostMapping
    public ApiRequestVo insert(@RequestBody @Valid BlogArticle blogArticle) {
        articleMapper.insert(blogArticle);
        return new ApiRequestVo();
    }

    @GetMapping("{id}")
    public ApiRequestVo getById(@Valid @PathVariable Integer id) {
        return new ApiRequestVo(articleMapper.selectByPrimaryKey(id));
    }

    @GetMapping("/all")
    public ApiRequestVo getById() {
        System.out.println(request.getSession().getId());
        return new ApiRequestVo(articleMapper.selectByExample(null));
    }
}
