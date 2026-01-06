package com.vivek.controller;

import com.vivek.service.CartItemService;
import com.vivek.service.UserService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cart_items")
@RequiredArgsConstructor
public class CartItemController {

	private final CartItemService cartItemService;
	private final UserService userService;

}
