package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface  OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName); // czemu w tym serwisie cos jest a w zadnym innym nie ma ????
}
