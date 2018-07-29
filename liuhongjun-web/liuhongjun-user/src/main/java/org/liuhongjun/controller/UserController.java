package org.liuhongjun.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.liuhongjun.data.ApiRequestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private HttpServletRequest request;

    @GetMapping
    public ApiRequestVo getById() {
        System.out.println(request.getSession().getId());
        return new ApiRequestVo();
    }

}
