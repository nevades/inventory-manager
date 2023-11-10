/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lk.neva.InventoryManagement.repo;

import java.util.Optional;
import org.springframework.stereotype.Repository;
import lk.neva.InventoryManagement.modal.User;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Neva
 */
@Repository
public interface UserRepo extends CrudRepository<User, Integer> {

    Optional<User> findByUsernamePassword(String username, String password);

}
