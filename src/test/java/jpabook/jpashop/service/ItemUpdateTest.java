package jpabook.jpashop.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jpabook.jpashop.domain.item.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
public class ItemUpdateTest {

    @PersistenceContext
    EntityManager em;

    @Test
    public void updateTest() throws Exception {
        // given
        Book book = em.find(Book.class, 1L);

        book.setName("asdasf");
        // when

        // then
    }

}
