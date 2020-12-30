package guru.springframework.sfgpetclinic.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Builder
//@SuperBuilder
@Entity
@Table(name = "pets")
public class Pet extends BaseEntity{

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private PetType petType;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @JoinColumn(name = "birthDate")
    private LocalDate birthDate;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pet") //If i delete pet then visits are also deleted, it's mapped by pet on the other side.
    private Set<Visit> visits = new HashSet<>(); //We use new HashSet so the value is not null

    @Builder
    public Pet(Long id, String name, PetType petType, Owner owner, LocalDate birthDate, Set<Visit> visits) {
        super(id);
        this.name = name;
        this.petType = petType;
        this.owner = owner;
        this.birthDate = birthDate;
        this.visits = visits;
    }
}
