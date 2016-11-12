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
		userRepository.save(new User("Maryna", "password"));
		userRepository.save(new User("Saba", "passwort"));
		userRepository.save(new User("Katharina", "passwort"));

		for (User user : userRepository.findAll()) {
			System.out.println(user.getUserId());
			System.out.println(user.getLoginName());
			System.out.println(user.getPassword());
		}

	}

}