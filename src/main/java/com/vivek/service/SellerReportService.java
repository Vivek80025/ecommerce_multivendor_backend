package com.vivek.service;

import com.vivek.model.Seller;
import com.vivek.model.SellerReport;

public interface SellerReportService {
    SellerReport getSellerReport(Seller seller);
    SellerReport updateSellerReport( SellerReport sellerReport);

}
