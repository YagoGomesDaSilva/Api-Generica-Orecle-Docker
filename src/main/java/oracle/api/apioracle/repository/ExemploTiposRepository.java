package oracle.api.apioracle.repository;

import oracle.api.apioracle.entity.ExemploTipos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExemploTiposRepository extends JpaRepository<ExemploTipos, Long> {
}
