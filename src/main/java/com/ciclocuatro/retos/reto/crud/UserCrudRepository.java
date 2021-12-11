package com.ciclocuatro.retos.reto.crud;

import com.ciclocuatro.retos.reto.model.User;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author Reinaldo
 */
public interface UserCrudRepository extends CrudRepository<User, Integer> {

    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email, String password);
}
