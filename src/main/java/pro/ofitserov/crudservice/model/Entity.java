package pro.ofitserov.crudservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@javax.persistence.Entity
@NoArgsConstructor
@AllArgsConstructor
public class Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private Long id;

    @Column(unique = true)
    @Getter
    @Setter
    private String content;

    public Entity(String content) {
        this.content = content;
    }
}
