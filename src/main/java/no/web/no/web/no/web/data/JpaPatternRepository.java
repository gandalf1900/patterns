package no.web.no.web.no.web.data;

import no.web.model.Pattern;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class JpaPatternRepository {

    @PersistenceContext
    EntityManager em;

    public Optional<List<Pattern>> findAllPatterns() {
        final Query query = em.createQuery("select p from Pattern p");
        List<Pattern> entries = query.getResultList();
        return Optional.of(entries);
    }
}
