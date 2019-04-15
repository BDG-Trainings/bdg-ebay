package com.bdg.bdgebay.service.item;

import com.bdg.bdgebay.dto.item.ItemCreationRequest;
import com.bdg.bdgebay.dto.item.ItemUpdateRequest;
import com.bdg.bdgebay.entity.Item;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class ItemServiceImpl implements ItemService {


    @Override
    public Item get(Long userId) {
        return null;
    }

    @Override
    public Item create(ItemCreationRequest creationRequest) {
        Assert.notNull(creationRequest, "Creation request is invalid..");
        return null;
    }

    @Override
    public Item delete(Long userId) {
        return null;
    }

    @Override
    public Item update(ItemUpdateRequest updateRequest) {
        return null;
    }
}
