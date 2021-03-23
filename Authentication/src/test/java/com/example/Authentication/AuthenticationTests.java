package com.example.Authentication;


import com.example.Authentication.entities.User;
import com.example.Authentication.repositories.UserRepository;
import com.example.Authentication.services.UserService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;



@DataJpaTest
public class AuthenticationTests {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private UserService userserv;


    private User dummyUser = new User();
    
    @BeforeEach
    public void startDummy() {
    	 dummyUser.setUsername("Dummy");
         dummyUser.setEmail("test@test.com");
         dummyUser.setPassword("password");
         entityManager.persist(dummyUser);
         entityManager.flush();
    }
    @Test
    public void whenFindByName_thenReturnUser() {
        User found = userRepository.findByUsername(dummyUser.getUsername());
        assertEquals(found.getUsername(), dummyUser.getUsername());
    }

    @Test
    public void AthUser() {
    	boolean b = userserv.authenticate(dummyUser.getUsername(), dummyUser.getPassword(), dummyUser);
        assertTrue(b);
    }

	@Test
	public void WhenSetPassword_CheckGetPassword() {
		User testUser = new User();
		testUser.setPassword("mypassword");
		assertEquals(testUser.getPassword(),"mypassword");
	}
	
	@Test
	public void testListProducts() {
	    List<User> u = (List<User>) userRepository.findAll();
	    assertNotEquals(u.size(),0);
	}

}
