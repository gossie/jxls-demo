package de.jugbremen.jxlsdemo.model;

import java.util.ArrayList;

import de.jugbremen.jxlsdemo.model.ArticleGroup;
import de.jugbremen.jxlsdemo.model.ShoppingCart;

public class ShoppingCartBuilder {

    private ShoppingCart shoppingCart;


    private ShoppingCartBuilder() {
        shoppingCart = new ShoppingCart("", new ArrayList<ArticleGroup>());
    }


    public static ShoppingCartBuilder getInstance() {
        return new ShoppingCartBuilder();
    }


    public ShoppingCartBuilder withName(String name) {
        shoppingCart = new ShoppingCart(name, shoppingCart.getArticleGroups());
        return this;
    }


    public ShoppingCartBuilder addArticleGroup(ArticleGroup articleGroup) {
        shoppingCart.getArticleGroups().add(articleGroup);
        return this;
    }


    public ShoppingCart build() {
        return shoppingCart;
    }
}
