package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Category {
  @Id
  @GeneratedValue
  private Long id;
//  @ManyToMany(fetch = FetchType.LAZY,
//              mappedBy = "categories")
//  private List<Item> items;
  @ManyToOne
  @JoinColumn(name = "parent_id")
  private Category parent;
  @OneToMany
  @JoinColumn(name = "child_id")
  private List<Category> child;


}
