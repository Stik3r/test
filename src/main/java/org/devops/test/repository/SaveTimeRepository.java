package org.devops.test.repository;


import org.devops.test.entity.SaveTimeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaveTimeRepository extends JpaRepository<SaveTimeEntity, Long> {
    SaveTimeEntity findFirstByOrderByIdDesc();
}
