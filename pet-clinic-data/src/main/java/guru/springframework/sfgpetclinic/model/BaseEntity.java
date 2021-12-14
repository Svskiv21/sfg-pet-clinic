package guru.springframework.sfgpetclinic.model;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass // this sets it as a basic class, other entities are going to inherit after it
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
