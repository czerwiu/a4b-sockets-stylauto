
package com.assecobs.a4b.sockets.stylauto;

import lombok.Data;
import java.util.List;

@Data
public class OrderPosition {
    private long id;
    private long offerPositionId;
    private int ordinalNo;
    private String positionHash;
    private Product product;
    private int quantity;
    private SaleUnitPrice saleUnitPrice;
    private List<SaleUnitsInfo> saleUnitsInfo;
}
