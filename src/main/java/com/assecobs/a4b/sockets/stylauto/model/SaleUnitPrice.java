
package com.assecobs.a4b.sockets.stylauto.model;

import lombok.Data;

@Data
public class SaleUnitPrice {
    private String currency;
    private double gross;
    private double net;
    private int vat;
}
