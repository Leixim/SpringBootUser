package vart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vart.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
