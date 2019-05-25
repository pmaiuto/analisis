package ar.pmaiuto.donaciones.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "abo")
public class Abo {
	
	@Id
	private String id;
	private String abolsa;
	private String grupo;
	private String factor;
	
	public Abo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getAbolsa() {
		return abolsa;
	}
	public void setAbolsa(String abolsa) {
		this.abolsa = abolsa;
	}
	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getGrupo() {
		return grupo;
	}


	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}


	public String getFactor() {
		return factor;
	}
	public void setFactor(String factor) {
		this.factor = factor;
	}
	

}
