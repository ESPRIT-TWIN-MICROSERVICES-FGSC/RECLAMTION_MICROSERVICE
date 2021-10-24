package esprit.fgsc.RECLAMTIONSMICROSERVICES.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import esprit.fgsc.RECLAMTIONSMICROSERVICES.entities.Reclamtion;

@Repository
public interface RECLAMTIONSRepository extends MongoRepository<Reclamtion, String>{

}
