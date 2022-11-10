package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class OrderItem {
  @Id
  @GeneratedValue
  private String id;
//  @ManyToOne(fetch = FetchType.LAZY)
//  private Item item;
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "order_id")
  private Order order;
  private int orderPrice;
  private int count;

}
