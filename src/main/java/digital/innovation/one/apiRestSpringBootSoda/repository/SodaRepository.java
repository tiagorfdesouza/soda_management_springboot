package digital.innovation.one.apiRestSpringBootSoda.repository;

import digital.innovation.one.apiRestSpringBootSoda.entidades.Soda;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SodaRepository extends JpaRepository<Soda, Long> {

    Optional<Soda> findByName(String name);
}
