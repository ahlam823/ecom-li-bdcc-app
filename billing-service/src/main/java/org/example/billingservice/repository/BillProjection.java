package org.example.billingservice.repository;

import org.example.billingservice.entities.Bill;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name = "fullBill", types = Bill.class)
public interface BillProjection {
    Long getId();
    Date getBillingDate();
    long getCustomerId();
}
