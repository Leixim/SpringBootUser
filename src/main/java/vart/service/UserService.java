package vart.service;

import vart.domain.User;

import java.util.List;

public interface UserService {

    User getById(Long id);

    void save(User user);

    void delete(Long id);

    List<User> getAll();

}
