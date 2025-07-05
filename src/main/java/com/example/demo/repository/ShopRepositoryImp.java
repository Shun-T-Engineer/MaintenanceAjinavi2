package com.example.demo.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Shop;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ShopRepositoryImp implements ShopRepository {
	
	private final JdbcTemplate jdbcTemplate;

	
	@Override
	public void addShop(Shop shop) {
		String sql =
				"INSERT INTO m_restaurant" +
				"(restaurant_name, catch_phrase)" +
				"VALUES(?, ?)";
		
		jdbcTemplate.update(sql, shop.getRestaurantName(),
													 shop.getCachPhrase() );

	}

}
