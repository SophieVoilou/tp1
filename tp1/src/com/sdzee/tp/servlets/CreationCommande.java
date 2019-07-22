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
		
		String montantCo = null;
        try {
            
        	montantCo =  request.getParameter( "montantCommande" ) ;
        } catch ( NumberFormatException e ) {
           
        	
        }
		String modePaiementCo = request.getParameter( "modePaiementCommande" );
		String statutPaiementCo = request.getParameter( "statutPaiementCommande" );
		String modeLivraisonCo = request.getParameter( "modeLivraisonCommande" );
		String statutLivraisonCo = request.getParameter( "statutLivraisoncommande" );
		
	
		String message;
		 if ( nomCl==null || adresseCl==null || telephoneCl==null || montantCo==null
	                || modePaiementCo==null || modeLivraisonCo==null ) {
	            message = "Erreur - Vous n'avez pas rempli tous les champs obligatoires. <br> <a href=\"creerCommande.jsp\">Cliquez ici</a> pour accéder au formulaire de création d'une commande.";
	        } else {
	            message = "Commande créée avec succès !";
	        
		Client premierBean = new Client();
		
		premierBean.setNomCl(nomCl);
		premierBean.setPrenomCl(prenomCl);
		premierBean.setAdresseCl(adresseCl);
		premierBean.setTelephoneCl(telephoneCl);
		premierBean.setEmailCl(emailCl);
		
		Commande deuxiemeBean = new Commande ();
		deuxiemeBean.setClient(premierBean);
		deuxiemeBean.setDateCo(dateCo);
		
		deuxiemeBean.setMontantCo(Double.parseDouble(montantCo));
		deuxiemeBean.setModePaiementCo(modePaiementCo);
		deuxiemeBean.setStatutPaimentCo(statutPaiementCo);
		deuxiemeBean.setModeLivraisonCo(modeLivraisonCo);
		deuxiemeBean.setStatutLivraisonCo(statutLivraisonCo);
		
		request.setAttribute( "commande", deuxiemeBean );
		request.setAttribute( "message", message );
		System.out.println(nomCl+prenomCl+adresseCl+telephoneCl+emailCl+premierBean+dateCo+montantCo+modePaiementCo+statutPaiementCo+modeLivraisonCo+statutLivraisonCo);
		this.getServletContext().getRequestDispatcher( "/WEB-INF/afficherCommande.jsp" ).forward( request, response );
	}
		 this.getServletContext().getRequestDispatcher( "/WEB-INF/creerCommande.jsp" ).forward( request, response );
	}
}
