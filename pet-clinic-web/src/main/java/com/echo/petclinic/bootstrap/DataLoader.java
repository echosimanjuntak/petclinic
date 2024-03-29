package com.echo.petclinic.bootstrap;

import com.echo.petclinic.model.Owner;
import com.echo.petclinic.model.Vet;
import com.echo.petclinic.services.OwnerService;
import com.echo.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Eunike");
        owner1.setLastName("Simanjuntak");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Echo");
        owner2.setLastName("Simanjuntak");

        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setFirstName("Rasna");
        vet1.setLastName("Manik");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Ruth");
        vet2.setLastName("Gracia");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");

    }
}
