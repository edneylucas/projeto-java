package br.com.codenation.desafio.cryptography.model;

public class Codenation {
	
	private Integer numero_casas = null;
	
	private String token = null;
	
	private String cifrado = null;
	
	private String decifrado = null;
	
	private String resumo_criptografico = null;

	public Integer getNumero_casas() {
		return numero_casas;
	}

	public void setNumero_casas(Integer numero_casas) {
		this.numero_casas = numero_casas;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getCifrado() {
		return cifrado;
	}

	public void setCifrado(String cifrado) {
		this.cifrado = cifrado;
	}

	public String getDecifrado() {
		return decifrado;
	}

	public void setDecifrado(String decifrado) {
		this.decifrado = decifrado;
	}

	public String getResumo_criptografico() {
		return resumo_criptografico;
	}

	public void setResumo_criptografico(String resumo_criptografico) {
		this.resumo_criptografico = resumo_criptografico;
	}

}
