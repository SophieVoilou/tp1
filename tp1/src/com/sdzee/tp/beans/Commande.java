package com.sdzee.tp.beans;

public class Commande {
	private Client client;
	private String dateCo;
	private double montantCo; 
	private String modePaiementCo;
	private String statutPaiementCo;
	private String modeLivraisonCo;
	private String statutLivraisonCo;
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public String getDateCo() {
		return dateCo;
	}
	public void setDateCo(String dateCo) {
		this.dateCo = dateCo;
	}
	public double getMontantCo() {
		return montantCo;
	}
	public void setMontantCo(double montantCo) {
		this.montantCo = montantCo;
	}
	public String getModePaiementCo() {
		return modePaiementCo;
	}
	public void setModePaiementCo(String modePaiementCo) {
		this.modePaiementCo = modePaiementCo;
	}
	public String getStatutPaiementCo() {
		return statutPaiementCo;
	}
	public void setStatutPaimentCo(String statutPaimentCo) {
		this.statutPaiementCo = statutPaimentCo;
	}
	public String getModeLivraisonCo() {
		return modeLivraisonCo;
	}
	public void setModeLivraisonCo(String modeLivraisonCo) {
		this.modeLivraisonCo = modeLivraisonCo;
	}
	public String getStatutLivraisonCo() {
		return statutLivraisonCo;
	}
	public void setStatutLivraisonCo(String statutLivraisonCo) {
		this.statutLivraisonCo = statutLivraisonCo;
	}

	
	
}
