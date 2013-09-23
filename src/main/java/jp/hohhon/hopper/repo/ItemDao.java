package jp.hohhon.hopper.repo;

import java.util.List;

import jp.hohhon.hopper.domain.Item;

public interface ItemDao
{
    public Item findById(Long id);

    public Item findByEmail(String email);

    public List<Item> findAllOrderedByName();

    public void register(Item item);
}
