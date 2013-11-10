package jughb.jxlsdemo;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import jughb.jxlsdemo.model.ShoppingCart;
import net.sf.jxls.exception.ParsePropertyException;
import net.sf.jxls.transformer.XLSTransformer;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class JxlsExporter {

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
