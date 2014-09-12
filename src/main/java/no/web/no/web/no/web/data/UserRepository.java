package no.web.no.web.no.web.data;

import no.web.no.web.model.User;

import javax.naming.NamingException;

public interface UserRepository {
    public User findUser(String username) throws NamingException;
}
