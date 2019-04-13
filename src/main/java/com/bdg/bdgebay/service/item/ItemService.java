package com.bdg.bdgebay.service.item;

import com.bdg.bdgebay.dto.item.ItemCreationRequest;
import com.bdg.bdgebay.dto.item.ItemUpdateRequest;
import com.bdg.bdgebay.entity.Item;


public interface ItemService {
	
	    Item get(Long userId);

	    Item create(ItemCreationRequest creationRequest);

	    Item delete(Long userId);

	    Item update(ItemUpdateRequest updateRequest);


}
