package study.datajpa.repository;

import org.springframework.stereotype.Repository;
import study.datajpa.entity.Owner;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Repository
public class TeamJpaRepository {

    @PersistenceContext
    private EntityManager em;

    public Owner save(Owner team) {
        em.persist(team);
        return team;
    }

    public void delete(Owner team) {
        em.remove(team);
    }

    public List<Owner> findAll() {
        return em.createQuery("select  t from Owner t", Owner.class)
                .getResultList();
    }

    public Optional<Owner> findById(Long id) {
        Owner team = em.find(Owner.class, id);
        return Optional.ofNullable(team);
    }

    public long count() {
        return em.createQuery("select count(t) from Owner t", Long.class)
                .getSingleResult();
    }
}
