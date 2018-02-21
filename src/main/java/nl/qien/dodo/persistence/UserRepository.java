package nl.qien.dodo.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import nl.qien.dodo.domain.User;
	
@Repository
public interface UserRepository extends CrudRepository <User, Long>{

	User findByUsername(String username);
	
}