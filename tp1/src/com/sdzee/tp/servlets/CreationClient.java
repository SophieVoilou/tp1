package com.sdzee.tp.servlets;

import javax.servlet.http.HttpServlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sdzee.tp.beans.Client;

public class CreationClient extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomCl = request.getParameter( "nomClient" );
		String prenomCl = request.getParameter( "prenomClient" );
		String adresseCl = request.getParameter( "adresseClient" );
		String telephoneCl = request.getParameter( "telephoneClient" );
		String emailCl = request.getParameter( "emailClient" );
		
		String message ;
		if ( nomCl==null || adresseCl==null || telephoneCl==null ) {
            message = "Erreur - Vous n'avez pas rempli tous les champs obligatoires. <br> <a href=\"creerClient.jsp\">Cliquez ici</a> pour accéder au formulaire de création d'un client.";
        } else {
            message = "Client créé avec succès !";
        
        
		Client premierBean = new Client();
		
		premierBean.setNomCl(nomCl);
		premierBean.setPrenomCl(prenomCl);
		premierBean.setAdresseCl(adresseCl);
		premierBean.setTelephoneCl(telephoneCl);
		premierBean.setEmailCl(emailCl);
		
		request.setAttribute( "client", premierBean );
		request.setAttribute("message", message);
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/afficherClient.jsp" ).forward( request, response );
        }
		this.getServletContext().getRequestDispatcher( "/WEB-INF/creerClient.jsp" ).forward( request, response );
	}
}
