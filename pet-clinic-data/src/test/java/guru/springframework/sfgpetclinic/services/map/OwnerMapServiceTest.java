package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.PetService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnerMapServiceTest {

    OwnerMapService ownerMapService;

    @BeforeEach
    void setUp() {
        ownerMapService = new OwnerMapService(new PetTypeMapServce(), new PetMapService());

        ownerMapService.save(Owner.builder().id(1L).build());

    }

    @Test
    void findAll() {
    }

    @Test
    void delete() {
    }

    @Test
    void save() {
    }

    @Test
    void deletebyId() {
    }

    @Test
    void findById() {
    }

    @Test
    void findByLastName() {
    }
}