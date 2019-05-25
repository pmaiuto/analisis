package ar.pmaiuto.donaciones.model;

public class SexoDonanteResult {
	
	private String sexoDonante;
	private String tipoDonante;
	private String estado;
	private long total;
	
	public SexoDonanteResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public String getSexoDonante() {
		return sexoDonante;
	}



	public void setSexoDonante(String sexoDonante) {
		this.sexoDonante = sexoDonante;
	}



	public String getTipoDonante() {
		return tipoDonante;
	}

	public void setTipoDonante(String tipoDonante) {
		this.tipoDonante = tipoDonante;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	
}
