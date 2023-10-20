package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.entity.ADdetails;
//import za.gov.dpw.worxtracksolution.entity.User;
import org.springframework.stereotype.Service;

import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@Service
public class ADdetailsService {


    private String ldapUrl = "ldap://10.124.36.235:389";


    private String ldapBaseDn = "DC=ndpw,DC=local";


    private String ldapUserDn = "No-Reply";

    private String ldapUserPassword = "str8orDPW&789&";

    public List<ADdetails> searchAdUsersByName(String name) throws NamingException, javax.naming.NamingException {

        Properties env = new Properties();
        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        env.put(Context.PROVIDER_URL, ldapUrl);
        env.put(Context.SECURITY_AUTHENTICATION, "simple");
        env.put(Context.SECURITY_PRINCIPAL, ldapUserDn);
        env.put(Context.SECURITY_CREDENTIALS, ldapUserPassword);

        DirContext context = new InitialDirContext(env);

        String filter = "(&(objectClass=user)(displayName=" + name + "*))";

        SearchControls controls = new SearchControls();
        controls.setSearchScope(SearchControls.SUBTREE_SCOPE);

        NamingEnumeration<SearchResult> results = context.search(ldapBaseDn, filter, controls);

        List<ADdetails> users = new ArrayList<>();

        while (results.hasMoreElements()) {
            SearchResult result = results.nextElement();
            ADdetails user = new ADdetails();

            user.setDisplayName(getAttribute(result, "displayName"));
            user.setEmail(getAttribute(result, "mail"));
            user.setPhone(getAttribute(result, "telephoneNumber"));
            user.setDepartment(getAttribute(result, "department"));
            user.setPassword(getAttribute(result, "userPassword"));
            users.add(user);
        }

        context.close();

        return users;
    }

//    public List<User> getByUserName(String name) throws NamingException, javax.naming.NamingException {
//
//        Properties env = new Properties();
//        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
//        env.put(Context.PROVIDER_URL, ldapUrl);
//        env.put(Context.SECURITY_AUTHENTICATION, "simple");
//        env.put(Context.SECURITY_PRINCIPAL, ldapUserDn);
//        env.put(Context.SECURITY_CREDENTIALS, ldapUserPassword);
//
//        DirContext context = new InitialDirContext(env);
//
//        String filter = "(&(objectClass=user)(displayName=" + name + "*))";
//        String[] attributeFilter = { "displayName", "mail", "telephoneNumber", "department", "userPassword"};
//
//        SearchControls controls = new SearchControls();
//        controls.setSearchScope(SearchControls.SUBTREE_SCOPE);
//        controls.setReturningAttributes(attributeFilter);
//
//        NamingEnumeration<SearchResult> results = context.search(ldapBaseDn, filter, controls);
//
//        List<User> users = new ArrayList<>();
//
//        while (results.hasMoreElements()) {
//            SearchResult result = results.nextElement();
//            User user = new User();
//            user.setFullName(getAttribute(result, "displayName"));
//            user.setEmail(getAttribute(result, "mail"));
//            user.setUserPassword(getAttribute(result, "userPassword")); // get the user password from AD
//            users.add(user);
//        }
//
//        context.close();
//
//        return users;
//    }



    private String getAttribute(SearchResult result, String attribute) throws NamingException, javax.naming.NamingException {
        Attribute attr = result.getAttributes().get(attribute);
        return attr != null ? attr.get().toString() : null;
    }

}
