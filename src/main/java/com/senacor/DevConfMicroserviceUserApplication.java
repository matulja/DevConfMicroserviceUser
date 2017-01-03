package com.senacor;

import com.senacor.model.Token;
import com.senacor.model.User;
import com.senacor.repository.TokenRepository;
import com.senacor.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DevConfMicroserviceUserApplication implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;

    @Autowired
    TokenRepository tokenRepository;


	public static void main(String[] args) {

		SpringApplication.run(DevConfMicroserviceUserApplication.class, args);

	}

	@Override
	public void run(String... strings) throws Exception {
		//TODO delete commandlinerunner

        tokenRepository.deleteAll();

	}
}