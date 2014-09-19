package no.web.no.web.beans;

import no.web.model.Pattern;
import no.web.no.web.service.PatternService;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

import static no.web.no.web.beans.BeanUtil.addMessage;

@ManagedBean
@ViewScoped
public class PatternBean {

    private List<Pattern> patternList;

    private String name;
    private String alternativeName;
    private String description;
    private String longDescription;
    private String type;

    @Inject
    PatternService patternService;

    public PatternBean() {
        this.patternList = patternList;
    }

    public void addPattern(ActionEvent actionEvent) {
        Pattern pattern = new Pattern(name, alternativeName,  description, longDescription, type);
        System.out.println("************ addPattern");
        //FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "Pattern added"));
        addMessage("Pattern added");
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlternativeName() {
        return alternativeName;
    }

    public void setAlternativeName(String alternativeName) {
        this.alternativeName = alternativeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
