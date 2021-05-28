package dao.impl;

import dao.ActorsDao;
import model.Actor;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class ActorsImpl implements ActorsDao {

    private EntityManager entityManager;

    public ActorsImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    /**
     * Visszaad egy listát, amely az összes színészt tartalmazza az adatbázisban.
     * @return Egy lista, amely színészeket tartalmaz.
     */
    @Override
    public List<Actor> getAllActor() {
        TypedQuery<Actor> query = entityManager.createQuery(
                "SELECT r FROM Movie r", Actor.class);
        return query.getResultList();
    }

    /**
     * Feltölti a színészt az adatbázisba.
     * @param entity Az a színész, amelyet feltölt az adatbázisba.
     */
    @Override
    public void persist(Actor entity) {
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
    }

}
