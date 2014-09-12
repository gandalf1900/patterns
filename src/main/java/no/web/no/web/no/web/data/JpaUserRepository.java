package no.web.no.web.no.web.data;

import no.web.no.web.model.User;
import javax.enterprise.inject.Alternative;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.io.Serializable;

public class JpaUserRepository implements UserRepository, Serializable {

    @PersistenceContext(unitName = "primary")
    EntityManager em;

    @Override
    public User findUser(final String username) {
       return null;
    }
}
