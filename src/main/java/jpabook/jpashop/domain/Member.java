package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Member {
  @Id
  @GeneratedValue
  private Long id;
  private String name;
  @Embedded
  private Address address;
  @OneToMany(
          fetch = FetchType.LAZY,
          mappedBy = "member")
  private List<Order> orders;
}
