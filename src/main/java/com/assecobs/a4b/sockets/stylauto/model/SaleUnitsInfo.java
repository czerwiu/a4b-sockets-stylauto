
package com.assecobs.a4b.sockets.stylauto.model;

import lombok.Data;

@Data
public class SaleUnitsInfo {
    private boolean baseUnit;
    private double baseUnitRate;
    private boolean clientUnit;
    private String externalId;
    private double qty;
    private String shortcut;
    private long unitId;
}
