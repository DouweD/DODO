package nl.qien.dodo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.qien.dodo.domain.User;
import nl.qien.dodo.persistence.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public Iterable<User> getUsers() {
		return userRepository.findAll();
	}
	
	public void save(final User user) {
		userRepository.save(user);
	}

	public User getUserById(Long id) {
		return userRepository.findOne(id);
	}
	
	
	public User findUserByUsername(final String username) {
		return userRepository.findByUsername(username);
	}
	

}
