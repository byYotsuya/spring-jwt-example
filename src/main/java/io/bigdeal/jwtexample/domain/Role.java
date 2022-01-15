package io.bigdeal.jwtexample.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

/*
 * @author: Miguel Martinez | Zen'in
 * @since: 10/01/2022
 */
@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Role {
  @Id @GeneratedValue(strategy = AUTO)
  private Long id;
  private String name;
}
