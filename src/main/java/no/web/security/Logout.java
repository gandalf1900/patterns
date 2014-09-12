package no.web.security;

import no.web.ViewUtil;

import javax.enterprise.context.Conversation;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

@Named
public class Logout {
    @Inject
    private FacesContext facesContext;

    @Inject
    Conversation conversation;

    public Logout(){

    }

    public String logout() throws ServletException {
        HttpServletRequest request = (HttpServletRequest) facesContext.getExternalContext().getRequest();
        request.logout();
        if (!conversation.isTransient())  {
            conversation.end();
        }
        return ViewUtil.toView("search.xhtml").withRedirect().toUrl();
    }
}