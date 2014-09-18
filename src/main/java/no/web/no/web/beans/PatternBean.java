package no.web.no.web.beans;

import no.web.model.Pattern;
import no.web.no.web.service.PatternService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

import static no.web.no.web.beans.BeanUtil.addMessage;

@ManagedBean
@ViewScoped
public class PatternBean {



    private List<Pattern> patternList;

    @Inject
    PatternService patternService;


    public PatternBean() {
        this.patternList = patternList;
    }

    public void addPattern(ActionEvent actionEvent) {
        System.out.println("************ addPattern");
        addMessage("Pattern added");
    }



    public void showDetails() {
        System.out.println("test");
    }


    public List<Pattern> getPatternList() {
        return patternList;
    }

    @PostConstruct
    public void initialize() {
        System.out.println("************* INIT BEAN *****************************");

        Optional<List<Pattern>> optionalList = patternService.findAllPatterns();

       if (optionalList.isPresent()) {
           patternList = optionalList.get();
       }
    }
}
