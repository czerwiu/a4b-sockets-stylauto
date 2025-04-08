
package com.assecobs.a4b.sockets.stylauto.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Data
public class DeliveryRequest {
    private Map<String, Object> additionalData;
    private String clientExternalId;
    private String contractorExternalId;
    private LocalDateTime createDate;
    private double currencyRate;
    private Object deliveryAddress;
    private LocalDateTime deliveryDate;
    private String deliveryType;
    private long id;
    private Object invoiceAddress;
    private String number;
    private String orderCurrency;
    private List<OrderPosition> orderPositions;
    private Object pickupAddress;
    private StoreDTO storeDTO;
    private String voucherCode;
}
