package esprit.fgsc.RECLAMTIONSMICROSERVICES.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import esprit.fgsc.RECLAMTIONSMICROSERVICES.entities.Reclamtion;
import esprit.fgsc.RECLAMTIONSMICROSERVICES.repository.RECLAMTIONSRepository;

@Service
public class RECLAMTIONSService {
	@Autowired
	public RECLAMTIONSRepository RECLAMTIONSRepository;

public List<Reclamtion>getAllDepartement(){
		 return RECLAMTIONSRepository.findAll();
	}
	
	public String deleteDepartement(String id) {   
		RECLAMTIONSRepository.deleteById(id);
    	return "reclamtion deleted";
	}
	
	public Reclamtion  addDepartement(Reclamtion Reclamtion) {
		
			
			return RECLAMTIONSRepository.save(Reclamtion);
			
		}

	
	
           
public Reclamtion updateDepartement(String id,Reclamtion newDepartement) {
	if(RECLAMTIONSRepository.findById(id).isPresent()) {
		Reclamtion existingDepartement = RECLAMTIONSRepository.findById(id).get();
		existingDepartement.setName(newDepartement.getName());
		existingDepartement.setEmail(newDepartement.getEmail());
		existingDepartement.setNumber(newDepartement.getNumber());
		existingDepartement.setDescription(newDepartement.getDescription());

		
	    
		return RECLAMTIONSRepository.save(existingDepartement);
		
	}else {
		return null;
	}
}

public Reclamtion getDepartementById(String id) {
	return RECLAMTIONSRepository.findById(id).get();
	
}
}
