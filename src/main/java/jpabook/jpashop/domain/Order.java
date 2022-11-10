package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Order {
  @Id
  @GeneratedValue
  private Long id;
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "member_id")
  private Member member;
  @OneToMany(
          fetch = FetchType.LAZY,
          mappedBy = "order")
  private List<OrderItem> orderItems;
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "order_id")
  private Delivery delivery;
  private Date orderDate;
  private OrderStatus status;



}
