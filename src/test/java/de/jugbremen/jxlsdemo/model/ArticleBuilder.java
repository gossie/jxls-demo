package de.jugbremen.jxlsdemo.model;

import de.jugbremen.jxlsdemo.model.Article;

public class ArticleBuilder {

    private Article article;


    private ArticleBuilder() {
        article = new Article("", 0.0);
    }


    public static ArticleBuilder getInstance() {
        return new ArticleBuilder();
    }


    public ArticleBuilder withName(String name) {
        article = new Article(name, article.getPrice());
        return this;
    }


    public ArticleBuilder withPrice(double price) {
        article = new Article(article.getName(), price);
        return this;
    }


    public Article build() {
        return article;
    }
}
