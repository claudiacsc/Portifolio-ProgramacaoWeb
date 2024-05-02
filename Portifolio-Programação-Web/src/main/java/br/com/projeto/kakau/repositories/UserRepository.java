package br.com.projeto.kakau.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.kakau.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
