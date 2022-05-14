/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.ArrayList;

/**
 *
 * @author fello
 */
public interface IMetier {
    public ArrayList<Medicament> getAllMedicaments();
    public ArrayList<Medicament> getAllInfosMedicaments();
    public void ajouterMedicament(Medicament unMedicament);
    public ArrayList<Famille> getAllNomFamille();
    public User GetUnUser(String login, String mdp);
    public User setInsertUser(int idUser, String pseudoUser, String emailUser, String mdpUser);
 public ArrayList<Dosage> getAllDosage();
public void InsererUnePrescription(String nomCommercial,String libelle, String forme, String posologie);
public void InsererUnMedicament(String unNom,String uneCompo,String unEffet, String unContreIndi,  float unPrix,  String uneFamille);
public void modifierIndividu(String unLabelle, int unCode);
public ArrayList<Individu> GetAllIndividus();
public void InsererIndividu(String libelle);
public void InsererInteraction(int numMedoc,int numMedocperturber);
    public void InsertUser(String pseudoUser, String emailUser, String mdpUser);
    
    public ArrayList<Individu>GetNomIndividus();
    public void modifierMedoc(String unDepo,String unNom,float unPrix,String unEffet,String uneFamille,String unContreIndi);
    public Medicament getLeMedicament(int code);
    
    public ArrayList<Interagir>GetAllPerturbateur();
    public void InsererUnMedicament(String uneCompo,String unNom,float unPrix,String unEffet,String uneFamille,String unContreIndi);
    
}


