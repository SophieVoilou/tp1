<%@ page pageEncoding="UTF-8" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Commande</title>
    </head>
    <body>
    
          <p class="info">${ message }</p>
          
            Récupération du Client :    </p>
           <p>  Prenom :${commande.client.prenomCl}</p>
            <p>Nom: ${commande.client.nomCl}</p>
            <p> Adresse :${commande.client.adresseCl}</p>
            <p> Numéro de tél : ${commande.client.telephoneCl}</p>
            <p> Email : ${commande.client.emailCl}</p>
        <p>
            Récupération de la commande  :  </p>
        
            <p> Date  ${commande.dateCo}
            <p> Montant :${commande.montantCo}
            <p>Mode de paiement :${commande.modePaiementCo}
            <p> Statut du paiement :${commande.statutPaiementCo}
            <p>Mode de livraison : ${commande.modeLivraisonCo}
            <p>Statut de livraison : ${commande.statutLivraisonCo}
       
        
    </body>
</html>