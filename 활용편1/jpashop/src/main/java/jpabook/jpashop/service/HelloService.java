package jpabook.jpashop.service;

import jpabook.jpashop.domain.item.Item;
import jpabook.jpashop.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
@RequiredArgsConstructor
public class HelloService {

    private final ItemRepository itemRepository;
    private final EntityManager em;

    public List<Item> findItem() {
        return itemRepository.findAll();
    }
}
