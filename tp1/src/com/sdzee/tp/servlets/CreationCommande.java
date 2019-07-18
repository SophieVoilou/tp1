package com.sdzee.tp.servlets;

import java.io.IOException;



import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import com.sdzee.tp.beans.Client;
import com.sdzee.tp.beans.Commande;

public class CreationCommande extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomCl = request.getParameter( "nomClient" );
		String prenomCl = request.getParameter( "prenomClient" );
		String adresseCl = request.getParameter( "adresseClient" );
		String telephoneCl = request.getParameter( "telephoneClient" );
		String emailCl = request.getParameter( "emailClient" );
		
        DateTime dt = new DateTime();
        DateTimeFormatter formatter = DateTimeFormat.forPattern( "dd/MM/yyyy HH:mm:ss" );
        
		String dateCo = dt.toString( formatter );
		
		double montantCo;
        try {
            
            montantCo = Double.parseDouble( request.getParameter( "montantCommande" ) );
        } catch ( NumberFormatException e ) {
           
            montantCo = -1;
        }
		String modePaiementCo = request.getParameter( "modePaiementCommande" );
		String statutPaiementCo = request.getParameter( "statutPaiementCommande" );
		String modeLivraisonCo = request.getParameter( "modePaiementLivraison" );
		String statutLivraisonCo = request.getParameter( "statutPaiementLivraison" );
		
	
		String message;
		 if ( nomCl.trim().isEmpty() || adresseCl.trim().isEmpty() || telephoneCl.trim().isEmpty() || montantCo == -1
	                || modePaiementCo.isEmpty() || modeLivraisonCo.isEmpty() ) {
	            message = "Erreur - Vous n'avez pas rempli tous les champs obligatoires. <br> <a href=\"creerCommande.jsp\">Cliquez ici</a> pour accéder au formulaire de création d'une commande.";
	        } else {
	            message = "Commande créée avec succès !";
	        }
		Client premierBean = new Client();
		
		premierBean.setNomCl(nomCl);
		premierBean.setPrenomCl(prenomCl);
		premierBean.setAdresseCl(adresseCl);
		premierBean.setTelephoneCl(telephoneCl);
		premierBean.setEmailCl(emailCl);
		
		Commande deuxiemeBean = new Commande ();
		deuxiemeBean.setClient(premierBean);
		deuxiemeBean.setDateCo(dateCo);
		deuxiemeBean.setMontantCo(montantCo);
		deuxiemeBean.setModePaiementCo(modePaiementCo);
		deuxiemeBean.setStatutPaimentCo(statutPaiementCo);
		deuxiemeBean.setModeLivraisonCo(modeLivraisonCo);
		deuxiemeBean.setStatutLivraisonCo(statutLivraisonCo);
		
		request.setAttribute( "Commande", deuxiemeBean );
		request.setAttribute( "message", message );
		this.getServletContext().getRequestDispatcher( "/afficherCommande.jsp" ).forward( request, response );
	}
}
