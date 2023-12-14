package Web.Service;

import Web.Dao.RoleDao;
import Web.Models.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class RoleServiceImpl implements RoleService{
    @Autowired
    RoleDao roleDao;
    @Transactional
    @Override
    public Role showRole(String name) {
        return roleDao.showRole(name);
    }
}
