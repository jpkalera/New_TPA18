package edu.a10.td03.tpa18.repository;


import edu.a10.td03.tpa18.model.Eleves;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElevesRepository extends JpaRepository<Eleves, Long> {
}