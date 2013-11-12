package de.jugbremen.jxlsdemo.model;

import java.util.ArrayList;

import de.jugbremen.jxlsdemo.model.Article;
import de.jugbremen.jxlsdemo.model.ArticleGroup;

public class ArticleGroupBuilder {

    private ArticleGroup articleGroup;


    private ArticleGroupBuilder() {
        articleGroup = new ArticleGroup("", new ArrayList<Article>());
    }


    public static ArticleGroupBuilder getInstance() {
        return new ArticleGroupBuilder();
    }


    public ArticleGroupBuilder withName(String name) {
        articleGroup = new ArticleGroup(name, articleGroup.getArticles());
        return this;
    }


    public ArticleGroupBuilder addArticle(Article article) {
        articleGroup.getArticles().add(article);
        return this;
    }


    public ArticleGroup build() {
        return articleGroup;
    }
}
