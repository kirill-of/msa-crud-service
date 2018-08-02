package pro.ofitserov.crudservice.backend;

import org.springframework.data.repository.CrudRepository;
import pro.ofitserov.crudservice.model.Entity;

public interface EntityRepository extends CrudRepository<Entity, Long> {
}


