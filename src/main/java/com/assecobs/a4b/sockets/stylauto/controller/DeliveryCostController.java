
package com.assecobs.a4b.sockets.stylauto.controller;

import com.assecobs.a4b.sockets.stylauto.model.DeliveryRequest;
import com.assecobs.a4b.sockets.stylauto.model.DeliveryResponse;
import com.assecobs.a4b.sockets.stylauto.model.OrderPosition;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculate-delivery")
public class DeliveryCostController {

    @PostMapping
    public DeliveryResponse calculateDelivery(@RequestBody DeliveryRequest request) {

        int totalQty = request.getOrderPositions().stream()
                .mapToInt(OrderPosition::getQuantity)
                .sum();

        double net = totalQty * 5.0;
        int vat = 23;
        double gross = Math.round(net * (1 + vat / 100.0) * 100.0) / 100.0;

        return new DeliveryResponse(net, vat, gross, "PLN");
    }
}
