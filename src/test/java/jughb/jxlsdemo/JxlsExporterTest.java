package jughb.jxlsdemo;

import jughb.jxlsdemo.model.ArticleBuilder;
import jughb.jxlsdemo.model.ArticleGroupBuilder;
import jughb.jxlsdemo.model.ShoppingCart;
import jughb.jxlsdemo.model.ShoppingCartBuilder;

import org.junit.Before;
import org.junit.Test;

public class JxlsExporterTest {

    private ShoppingCart shoppingCart;


    @Before
    public void setUp() {
        shoppingCart = ShoppingCartBuilder.getInstance()
                .withName("My shopping list")
                .addArticleGroup(ArticleGroupBuilder.getInstance()
                        .withName("Group 1")
                        .addArticle(ArticleBuilder.getInstance()
                                .withName("Article 1.1")
                                .withPrice(9.99)
                                .build())
                        .addArticle(ArticleBuilder.getInstance()
                                .withName("Article 1.2")
                                .withPrice(14.99)
                                .build())
                        .addArticle(ArticleBuilder.getInstance()
                                .withName("Article 1.3")
                                .withPrice(9.99)
                                .build())
                        .build())
                .addArticleGroup(ArticleGroupBuilder.getInstance()
                        .withName("Group 2")
                        .addArticle(ArticleBuilder.getInstance()
                                .withName("Article 2.1")
                                .withPrice(25.39)
                                .build())
                        .addArticle(ArticleBuilder.getInstance()
                                .withName("Article 2.2")
                                .withPrice(125.0)
                                .build())
                        .build())
                .build();
    }


    @Test
    public void testExportJxls() throws Exception {
        JxlsExporter excelExporter = new JxlsExporter();
        excelExporter.exportJxls(shoppingCart, "src/test/resources/jughb/jxlsdemo/shopping-list.xls", "target/shopping-list_JXLS.xls");
    }
}