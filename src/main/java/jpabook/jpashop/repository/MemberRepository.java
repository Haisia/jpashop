package jpabook.jpashop.repository;

import jpabook.jpashop.domain.Member;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class MemberRepository {
  @PersistenceContext
  private EntityManager em;


  public void save(Member member){
    em.persist(member);
  }

  public Member findOne(Long id){
    return em.find(Member.class, id);
  }

  public List<Member> findAll(){
    String query = "select m from Member as m";

    return em.createQuery(query, Member.class)
            .getResultList();
  }

  public List<Member> findByName(String name){
    String query = "select m from Member as m where m.name = :name";

    return em.createQuery(query, Member.class)
            .setParameter("name",name)
            .getResultList();
  }
}