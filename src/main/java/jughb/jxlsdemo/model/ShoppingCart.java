package jughb.jxlsdemo.model;

import java.util.List;

public class ShoppingCart {

    private String name;
    private List<ArticleGroup> articleGroups;


    public ShoppingCart(String name, List<ArticleGroup> articleGroups) {
        super();
        this.name = name;
        this.articleGroups = articleGroups;
    }


    public String getName() {
        return name;
    }


    public List<ArticleGroup> getArticleGroups() {
        return articleGroups;
    }
}
