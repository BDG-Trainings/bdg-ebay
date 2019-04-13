package com.bdg.bdgebay.repository.user;

import com.bdg.bdgebay.entity.Item;


public interface ItemRepository {
	
	Item findByNameAndDeletedIsNull(String itemName);

}
