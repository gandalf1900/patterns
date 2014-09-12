package no.web.no.web.producer;

import no.web.no.web.model.User;
import no.web.no.web.no.web.data.JpaUserRepository;
import no.web.no.web.no.web.data.UserRepository;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import javax.naming.NamingException;
import java.io.Serializable;
import java.security.Principal;

@SessionScoped
public class UserProducer implements Serializable {

    User user;
    @Inject
    Principal principal;

    //@Inject
    //JpaUserRepository userRepository;

    public UserProducer() {}

    @Produces
    @Named
    @SessionScoped
    @LoggedIn
    public User getUser() {
        String userName = principal.getName();
        user = new User(userName);
        return user;
    }
}
