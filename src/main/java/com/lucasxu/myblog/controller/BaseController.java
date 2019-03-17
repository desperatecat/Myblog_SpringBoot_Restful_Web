package com.lucasxu.myblog.controller;

import com.lucasxu.myblog.service.ArticleService;
import com.lucasxu.myblog.service.CategoryService;
import com.lucasxu.myblog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 基础控制器，包含了Controller层中共有的一些Service
 *
 * @author:lucasxu
 * @create:2019-01-20-上午 11:25
 */
public class BaseController {

    @Autowired
    ArticleService articleService;
    @Autowired
    CommentService commentService;
    @Autowired
    CategoryService categoryService;

}