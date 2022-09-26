package jpabook.jpashop.repository;

import jpabook.jpashop.domain.item.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@SpringBootTest
class HelloRepositoryTest {

    @Autowired
    HelloRepository helloRepository;

    @Test
    void test() {
        List<Item> all = helloRepository.findAll();
        System.out.println(all.size());
    }


}