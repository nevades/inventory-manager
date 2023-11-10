/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lk.neva.InventoryManagement.modal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

/**
 *
 * @author Neva
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Table("user")
public class User {

    @Id
    private Integer id;
    private String username;
    private String password;

}
