package io.bigdeal.jwtexample.repo;

import io.bigdeal.jwtexample.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 * @author: Miguel Martinez | Zen'in
 * @since: 10/01/2022
 */
public interface UserRepo extends JpaRepository<User, Long> {
  User findByUsername(String username);
}
