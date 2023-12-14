package Web.Dao;

import Web.Models.Role;
import Web.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Repository
public class RoleDaoImp implements RoleDao {
    @Autowired
    private EntityManagerFactory entityManagerFactory;
    @Override
    public Role showRole(String name) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Role role = entityManager.find(Role.class,name);
        System.out.println(role.toString());
        return role;
    }
}
