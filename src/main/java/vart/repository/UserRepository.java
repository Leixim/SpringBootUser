package vart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vart.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
