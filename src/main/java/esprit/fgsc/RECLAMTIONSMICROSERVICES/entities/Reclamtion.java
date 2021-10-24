package esprit.fgsc.RECLAMTIONSMICROSERVICES.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import esprit.fgsc.RECLAMTIONSMICROSERVICES.services.RECLAMTIONSService;

@Document
public class Reclamtion {
@Id
private String id;
private String Name;
private String email;
private String number;
private String description  ;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}




}
