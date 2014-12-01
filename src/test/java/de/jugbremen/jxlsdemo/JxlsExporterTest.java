package de.jugbremen.jxlsdemo;

import org.junit.Test;

public class JxlsExporterTest extends AbstractXlsTest {

    @Test
    public void testExportJxls() throws Exception {
        JxlsExporter excelExporter = new JxlsExporter();
        excelExporter.exportJxls(shoppingCart, "src/test/resources/de/jugbremen/jxlsdemo/shopping-list.xls", "target/shopping-list_JXLS.xls");
    }
}
