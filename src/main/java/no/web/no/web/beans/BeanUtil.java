package no.web.no.web.beans;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class BeanUtil {

    public static void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
