package Web.Dao;

import Web.Models.Role;
import Web.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

@Repository
public class RoleDaoImp implements RoleDao {
    @Autowired
    private EntityManagerFactory entityManagerFactory;
    @Override
    public Role showRole(String name) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery(
                "SELECT r FROM Role r WHERE r.name = :name", Role.class);
        query.setParameter("name", name);
        Role role = (Role) query.getSingleResult();
        System.out.println(role.toString());
        return role;
    }
}
