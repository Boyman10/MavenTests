package org.ouhai.demo.business.action;

import com.opensymphony.xwork2.ActionSupport;
import org.ouhai.demo.business.model.Person;

public class Register extends ActionSupport {
    
    private static final long serialVersionUID = 1L;
    
    private Person personBean;


    public String execute() throws Exception {
        //call Service class to store personBean's state in database
        
        return SUCCESS;
    }
    
    public Person getPersonBean() {
        return personBean;
    }
    
    public void setPersonBean(Person person) {
        personBean = person;
    }

}