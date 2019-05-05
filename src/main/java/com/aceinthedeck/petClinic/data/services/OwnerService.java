package com.aceinthedeck.petClinic.data.services;


import org.springframework.stereotype.Service;

import com.aceinthedeck.petClinic.data.modals.Owner;


public interface OwnerService extends CrudService<Owner, Long> {
	
	Owner findByLastName(String lastName);
	
}
