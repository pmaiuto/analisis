package ar.pmaiuto.donaciones.model;

public class TipoDonanteResult {

	private String anio;
	private String tipoDonante;
	private String estado;
	private long total;
	
	
	public TipoDonanteResult() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getAnio() {
		return anio;
	}


	public void setAnio(String anio) {
		this.anio = anio;
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
