package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Delivery {
  @Id
  @GeneratedValue
  private Long id;
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "delivery_id")
  private Order order;
  @Embedded
  private Address address;
  private DeliveryStatus status;
}
