package jpabook.jpashop;

import jpabook.jpashop.domain.Member;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class test {
    @PersistenceContext
    static private EntityManager em;

    public static void main(String[] args) {
        Member member = new Member();
        em.persist(member);




    }
}
