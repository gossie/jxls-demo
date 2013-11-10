package jughb.jxlsdemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import jughb.jxlsdemo.model.Article;
import jughb.jxlsdemo.model.ArticleGroup;
import jughb.jxlsdemo.model.ShoppingCart;
import net.sf.jxls.exception.ParsePropertyException;
import net.sf.jxls.transformer.XLSTransformer;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelExporter {

    public void exportPoi(ShoppingCart shoppingCart, String destFile) {
        Workbook wb = new HSSFWorkbook();
        Sheet sheet = wb.createSheet();

        int rownumber = 0;
        Row row = sheet.createRow(rownumber);
        Cell cell = row.createCell(0);
        cell.setCellValue(shoppingCart.getName());

        rownumber = 2;
        for(ArticleGroup group : shoppingCart.getArticleGroups()) {
            row = sheet.createRow(rownumber);
            cell = row.createCell(0);
            cell.setCellValue(group.getName());

            rownumber += 2;
            for(Article article : group.getArticles()) {
                row = sheet.createRow(rownumber++);
                cell = row.createCell(0);
                cell.setCellValue(article.getName());

                cell = row.createCell(2);
                cell.setCellValue(article.getPrice());
            }

            rownumber += 3;
        }

        try(FileOutputStream out = new FileOutputStream(destFile)) {
            wb.write(out);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }


    public void exportJxls(ShoppingCart shoppingCart, String template, String destFile) {
        Map<String, Object> map = new HashMap<>();
        map.put("cart", shoppingCart);

        XLSTransformer transformer = new XLSTransformer();

        try {
            transformer.transformXLS(template, map, destFile);
        } catch(ParsePropertyException | InvalidFormatException | IOException e) {
            e.printStackTrace();
        }
    }
}
