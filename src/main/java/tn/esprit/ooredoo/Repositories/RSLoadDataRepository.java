package tn.esprit.ooredoo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ooredoo.Entities.RSLoadData;

import java.util.List;

public interface RSLoadDataRepository extends JpaRepository<RSLoadData, Long> {
    List<RSLoadData> findByIdDeclarant(String idDeclarant);
}
