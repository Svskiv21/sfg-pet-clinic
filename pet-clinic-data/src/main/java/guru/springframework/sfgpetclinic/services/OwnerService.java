package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long>{
    Owner findLastNAme(String lastName); // czemu w tym serwisie cos jest a w zadnym innym nie ma ????
}
