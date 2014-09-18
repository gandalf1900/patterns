package no.web.no.web.service;

import no.web.model.Pattern;
import no.web.no.web.no.web.data.JpaPatternRepository;
import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

public class PatternService {

    private JpaPatternRepository patternRepository;

    @Inject
    public PatternService(final JpaPatternRepository patternDao) {
        this.patternRepository = patternDao;
    }

    public Optional<List<Pattern>> findAllPatterns() {
        return patternRepository.findAllPatterns();
    }
}
