package pro.ofitserov.crudservice.backend;

import org.springframework.beans.factory.annotation.Autowired;
import pro.ofitserov.crudservice.model.Entity;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private EntityRepository entityRepository;

    public void create(String content) {
        entityRepository.save(new Entity(content));
    }


    public Entity read(Long id) {
        return entityRepository.findById(id).get();
    }


    public void update(Long id, String content) {

        if (entityRepository.existsById(id)) {
            entityRepository.save(new Entity(id, content));
        }
    }

    public void delete(Long id) {
        entityRepository.deleteById(id);
    }

}
