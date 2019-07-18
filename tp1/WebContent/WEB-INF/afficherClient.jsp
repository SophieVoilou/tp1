<%@ page pageEncoding="UTF-8" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Client</title>
         <link type="text/css" rel="stylesheet" href="inc/style.css" />
    </head>
    <body>
    
      <p class="info">${ message }</p>
        <p>
            Récupération du Client :    </p>
           <p>  Prenom :${client.prenomCl}</p>
            <p>Nom: ${client.nomCl}</p>
            <p> Adresse :${client.adresseCl}</p>
            <p> Numéro de tél : ${client.telephoneCl}</p>
            <p> Email : ${client.emailCl}</p>
    
        
    </body>
</html>