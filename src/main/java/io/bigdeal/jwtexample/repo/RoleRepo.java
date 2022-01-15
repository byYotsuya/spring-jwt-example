package io.bigdeal.jwtexample.repo;

import io.bigdeal.jwtexample.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: Miguel Martinez | Zen'in
 * @since: 10/01/2022
 */
public interface RoleRepo extends JpaRepository<Role, Long> {
  Role findByName(String name);
}
