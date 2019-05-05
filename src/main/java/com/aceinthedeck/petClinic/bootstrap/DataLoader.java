package com.aceinthedeck.petClinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.aceinthedeck.petClinic.data.modals.Owner;
import com.aceinthedeck.petClinic.data.modals.Vet;
import com.aceinthedeck.petClinic.data.services.OwnerService;
import com.aceinthedeck.petClinic.data.services.VetService;
import com.aceinthedeck.petClinic.data.services.map.VetServiceMap;
import com.aceinthedeck.petClinic.data.services.map.OwnerServiceMap;

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
		// TODO Auto-generated method stub
		
		Owner owner1 = new Owner();
		owner1.setFirstName("Ace");
		owner1.setLastName("Kumar");
		
		ownerService.save(owner1);
		
		Vet vet1 = new Vet();
		vet1.setFirstName("Vet");
		vet1.setLastName("Kumar");
		
		vetService.save(vet1);
		
		System.out.println("Added owner and vet");
		
	}
	

}
