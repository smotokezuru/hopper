package jp.hohhon.hopper.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import jp.hohhon.hopper.domain.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ItemDaoImpl implements ItemDao
{
    @Autowired
    private EntityManager em;

    public Item findById(Long id)
    {
        return em.find(Item.class, id);
    }

    public Item findByEmail(String code)
    {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Item> criteria = builder.createQuery(Item.class);
        Root<Item> item = criteria.from(Item.class);

        /*
         * Swap criteria statements if you would like to try out type-safe criteria queries, a new
         * feature in JPA 2.0 criteria.select(member).orderBy(cb.asc(member.get(Member_.name)));
         */

        criteria.select(item).where(builder.equal(item.get("code"), code));
        return em.createQuery(criteria).getSingleResult();
    }

    public List<Item> findAllOrderedByName()
    {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Item> criteria = cb.createQuery(Item.class);
        Root<Item> item = criteria.from(Item.class);

        /*
         * Swap criteria statements if you would like to try out type-safe criteria queries, a new
         * feature in JPA 2.0 criteria.select(member).orderBy(cb.asc(member.get(Member_.name)));
         */

        criteria.select(item).orderBy(cb.asc(item.get("code")));
        return em.createQuery(criteria).getResultList();
    }

    public void register(Item item)
    {
        em.persist(item);
        return;
    }
}
