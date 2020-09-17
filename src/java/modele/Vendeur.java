/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author Zakina
 */
public class Vendeur {

    public Vendeur() {
    }

    public Vendeur(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }
    
   
    
    private String nomEntreprise ;

    public String getNomEntreprise() {
        return nomEntreprise;
    }

    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }
    
    
    
}
