/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author orel
 */
public class User {
    private int idUser;
    private String pseudoUser;
    private String emailUser;
    private String mdpUser;
    
    public User( String unPseudo, String unEmail, String unMdp)
    {
        
        pseudoUser=unPseudo;
        emailUser=unEmail;
        mdpUser=unMdp;
    }

  

    /**
     * @return the pseudoUser
     */
    public String getPseudoUser() {
        return pseudoUser;
    }

    /**
     * @return the emailUser
     */
    public String getEmailUser() {
        return emailUser;
    }

    /**
     * @return the mdpUser
     */
    public String getMdpUser() {
        return mdpUser;
    }

    /**
     * @param pseudoUser the pseudoUser to set
     */
    public void setPseudoUser(String pseudoUser) {
        this.pseudoUser = pseudoUser;
    }

    /**
     * @param emailUser the emailUser to set
     */
    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    /**
     * @param mdpUser the mdpUser to set
     */
    public void setMdpUser(String mdpUser) {
        this.mdpUser = mdpUser;
    }
    
}
