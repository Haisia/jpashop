package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@MappedSuperclass
@Getter
@Setter
public abstract class Item {
  @Id
  @GeneratedValue
  private Long id;
  private String name;
  private int price;
  private int stockQuantity;
//  @ManyToMany(fetch = FetchType.LAZY,
//              mappedBy = "items")
//  private List<Category> categories;

}
