package de.jugbremen.jxlsdemo;

import org.junit.Test;

import de.jugbremen.jxlsdemo.PoiExporter;

public class PoiExporterTest extends AbstractXlsTest {

    @Test
    public void testExportPoi() throws Exception {
        PoiExporter excelExporter = new PoiExporter();
        excelExporter.exportPoi(shoppingCart, "target/shopping-list_POI.xls");
    }
}
