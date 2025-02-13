package guru.springframework.sfgpetclinic.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Builder
@Entity
@Table(name = "vets")
public class Vet extends Person{

    @ManyToMany(fetch = FetchType.EAGER) // JPA will try to load everything at once
    @JoinTable(name = "vet_specialties", joinColumns = @JoinColumn(name = "vet"), inverseJoinColumns = @JoinColumn(name="speciality_id"))
    private Set<Specialty> specialties = new HashSet<>();

}
