package com.vivek.controller;

import com.vivek.domain.AccountStatus;
import com.vivek.exception.SellerException;
import com.vivek.model.HomeCategory;
import com.vivek.model.Seller;
import com.vivek.service.HomeCategoryService;
import com.vivek.service.SellerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {

    private final SellerService sellerService;
    private final HomeCategoryService homeCategoryService;


    @PatchMapping("/seller/{id}/status/{status}")
    public ResponseEntity<Seller> updateSellerStatus(
            @PathVariable Long id,
            @PathVariable AccountStatus status) throws SellerException {

        Seller updatedSeller = sellerService.updateSellerAccountStatus(id,status);
        return ResponseEntity.ok(updatedSeller);

    }

    @GetMapping("/home-category")
    public ResponseEntity<List<HomeCategory>> getHomeCategory(
          ) throws Exception {

        List<HomeCategory> categories=homeCategoryService.getAllCategories();
        return ResponseEntity.ok(categories);

    }

    @PatchMapping("/home-category/{id}")
    public ResponseEntity<HomeCategory> updateHomeCategory(
            @PathVariable Long id,
            @RequestBody HomeCategory homeCategory) throws Exception {

        HomeCategory updatedCategory=homeCategoryService.updateCategory(homeCategory,id);
        return ResponseEntity.ok(updatedCategory);

    }
}
