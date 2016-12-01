package com.senacor;

import com.senacor.model.User;
import com.senacor.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevConfMicroserviceUserApplication implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;


	public static void main(String[] args) {

		SpringApplication.run(com.senacor.DevConfMicroserviceUserApplication.class, args);

	}

	@Override
	public void run(String... strings) throws Exception {

		userRepository.deleteAll();
		userRepository.save(new User("Maryna", "123"));
		userRepository.save(new User("Saba", "123"));
		userRepository.save(new User("Katharina", "123"));
		userRepository.save(new User("Nadia", "123"));
		userRepository.save(new User("Vero", "123"));
		userRepository.save(new User("Hannes", "123"));
		userRepository.save(new User("Richard", "123"));

		User saba = userRepository.findByUsername("Saba");
		saba.setAdminRole();
		userRepository.save(saba);

		User maryna = userRepository.findByUsername("Maryna");
		maryna.setAdminRole();
		userRepository.save(maryna);

		for (User user : userRepository.findAll()) {
			System.out.println(user.getUserId());
			System.out.println(user.getUsername());
			System.out.println(user.getPassword());
			System.out.println(user.getRole());
		}

	}

}