package com.fenix.projeto.repositories;

import com.fenix.projeto.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
