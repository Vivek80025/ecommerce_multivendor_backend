package com.vivek.service;


import com.vivek.exception.WishlistNotFoundException;
import com.vivek.model.Product;
import com.vivek.model.User;
import com.vivek.model.Wishlist;

public interface WishlistService {

    Wishlist createWishlist(User user);

    Wishlist getWishlistByUserId(User user);

    Wishlist addProductToWishlist(User user, Product product) throws WishlistNotFoundException;

}

