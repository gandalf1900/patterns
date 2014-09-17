package no.web.no.web.beans;

import no.web.model.Pattern;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import static no.web.no.web.beans.BeanUtil.addMessage;

@ManagedBean
@ViewScoped
public class PatternBean {
    public void addPattern(ActionEvent actionEvent) {
        System.out.println("************ addPattern");
        addMessage("Pattern added");
    }

    List<Pattern> pattternList;

    public void showDetails() {
        System.out.println("test");
    }

    @PostConstruct
    public void initWizard() {
        System.out.println("************* INIT BEAN");
        pattternList = new ArrayList<Pattern>(5);
    }
}
