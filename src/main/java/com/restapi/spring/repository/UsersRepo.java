package com.restapi.spring.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.restapi.spring.entity.User;

@Repository
public interface UsersRepo extends JpaRepository<User, Long>{

	Optional<User> findByEmailId(String emailid);
	
}
