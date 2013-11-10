package jughb.jxlsdemo.model;

import java.util.List;

public class ArticleGroup {

    private String name;
    private List<Article> articles;


    public ArticleGroup(String name, List<Article> articles) {
        super();
        this.name = name;
        this.articles = articles;
    }


    public String getName() {
        return name;
    }


    public List<Article> getArticles() {
        return articles;
    }
}
