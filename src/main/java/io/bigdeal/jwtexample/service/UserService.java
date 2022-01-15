package io.bigdeal.jwtexample.service;

import io.bigdeal.jwtexample.domain.Role;
import io.bigdeal.jwtexample.domain.User;

import java.util.List;

/**
 * @author: Miguel Martinez | Zen'in
 * @since: 10/01/2022
 */
public interface UserService {
  User saveUser(User user);
  Role saveRole(Role role);
  void addRoleToUser(String username, String roleName);
  User getUser(String username);
  List<User> getUsers();

}
