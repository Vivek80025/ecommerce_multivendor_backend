package com.vivek.service;

import com.vivek.exception.ProductException;
import com.vivek.model.Cart;
import com.vivek.model.CartItem;
import com.vivek.model.Product;
import com.vivek.model.User;

public interface CartService {
	
	public CartItem addCartItem(User user,
								Product product,
								String size,
								int quantity) throws ProductException;
	
	public Cart findUserCart(User user);

}
