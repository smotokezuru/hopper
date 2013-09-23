package jp.hohhon.hopper.repo;

import jp.hohhon.hopper.domain.Item;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
