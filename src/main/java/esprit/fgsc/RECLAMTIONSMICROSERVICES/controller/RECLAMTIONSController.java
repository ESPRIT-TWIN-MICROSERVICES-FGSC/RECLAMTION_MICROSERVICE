package esprit.fgsc.RECLAMTIONSMICROSERVICES.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import esprit.fgsc.RECLAMTIONSMICROSERVICES.entities.Reclamtion;
import esprit.fgsc.RECLAMTIONSMICROSERVICES.services.RECLAMTIONSService;


@CrossOrigin(origins = "*")
@RestController
public class RECLAMTIONSController {

	@Autowired
	private  RECLAMTIONSService RECLAMTIONSService;
	@PostMapping("/add")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Reclamtion> createEmployee(@RequestBody Reclamtion reclamtion) {
		return new ResponseEntity<>(RECLAMTIONSService.addDepartement(reclamtion), HttpStatus.OK);
	}
	
	
	@GetMapping("/reclamtions")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<List<Reclamtion> >getAllEmployees(){
		 return new ResponseEntity<>(RECLAMTIONSService.getAllDepartement(),HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	@ResponseStatus(HttpStatus.OK)
	public String deleteDepartements(@PathVariable String id) {
	    return RECLAMTIONSService.deleteDepartement(id);
	}

	@PutMapping(value="/update/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Reclamtion>deleteDepartement(@PathVariable("id") String id,@Valid @RequestBody Reclamtion reclamtion) {
		return new ResponseEntity<>(RECLAMTIONSService.updateDepartement(id, reclamtion),HttpStatus.OK);
	}
	


}
