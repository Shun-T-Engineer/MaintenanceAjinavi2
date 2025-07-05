package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Restaurant;
import com.example.demo.form.RestaurantSearchForm;

@Controller
public class RestaurantListController {

	@GetMapping("/restaurant-list")
	private String restaurantList(@ModelAttribute RestaurantSearchForm form) {
		return "restaurant-list";
	}
	
	@PostMapping("/restaurant-search")
	private String restaurantSearch(@ModelAttribute RestaurantSearchForm form, Model model) {
		
		List<Restaurant> list = new ArrayList<Restaurant>();
		list.add(new Restaurant(1 , "データ１", "キャッチフレーズ1", 0));
		list.add(new Restaurant(2 , "データ2", "キャッチフレーズ2", 1));
		list.add(new Restaurant(3 , "データ3", "キャッチフレーズ3", 2));
		
		
		
		model.addAttribute("restaurantList", list);
		return "restaurant-list";
	}
}
