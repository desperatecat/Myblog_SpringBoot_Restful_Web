package com.lucasxu.myblog.service;

import com.lucasxu.myblog.dto.ArticleDto;
import com.lucasxu.myblog.dto.ArticleWithPictureDto;
import com.lucasxu.myblog.entity.ArticlePicture;

import java.util.List;

public interface ArticleService {

    void addArticle(ArticleDto articleDto);

    void deleteArticleById(Long id);

    void updateArticle(ArticleDto articleDto);

    void updateArticleCategory(Long articleId, Long categoryId);

    ArticleDto getOneById(Long id);

    ArticlePicture getPictureByArticleId(Long id);

    List<ArticleWithPictureDto> listAll();

    List<ArticleWithPictureDto> listByCategoryId(Long id);

    List<ArticleWithPictureDto> listLastest();
}
