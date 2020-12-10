package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);


        Owner owner1 = new Owner();
        owner1.setFirstName("Jan");
        owner1.setLastName("Witek");
        owner1.setAddress("5b");
        owner1.setCity("Jastkow");
        owner1.setTelephone("123456789");

        Pet johnsPet = new Pet();
        johnsPet.setPetType(savedDogPetType);
        johnsPet.setOwner(owner1);
        johnsPet.setBirthDate(LocalDate.now());
        johnsPet.setName("Mozart");
        owner1.getPets().add(johnsPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Kuba");
        owner2.setLastName("Slusarski");
        owner2.setAddress("26a");
        owner2.setCity("Naleczow");
        owner2.setTelephone("987654321");

        Pet jacobsPet = new Pet();
        jacobsPet.setPetType(savedCatPetType);
        jacobsPet.setOwner(owner2);
        jacobsPet.setBirthDate(LocalDate.now());
        jacobsPet.setName("Fifek");
        owner2.getPets().add(jacobsPet);

        ownerService.save(owner2);

        System.out.println("Loading Owners");

        Vet vet1 = new Vet();
        vet1.setFirstName("Natalia");
        vet1.setLastName("Krukar");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Karolina");
        vet2.setLastName("Skorupska");

        vetService.save(vet2);

        System.out.println("Loading Vets");

    }
}
