package vart.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Getter
@Setter
@ToString
public class User extends BaseEntity {

    @Column(name = "login")
    private String userLogin;

    @Column(name = "password")
    private String userPassword;

    @Column(name = "first_name")
    private String userFirstName;

    @Column(name = "last_name")
    private String userLastName;

}
