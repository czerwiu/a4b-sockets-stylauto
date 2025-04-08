
package com.assecobs.a4b.sockets.stylauto.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DeliveryResponse {
    private double net;
    private int vat;
    private double gross;
    private String currency;
}
