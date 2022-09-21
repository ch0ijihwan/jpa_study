package study.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.datajpa.entity.Owner;

public interface TeamRepository extends JpaRepository<Owner,Long> {

}
