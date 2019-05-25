package ar.pmaiuto.donaciones.model;

public class DonacionRangoEdadResult {
	
	private String rango;
	private long aceptadas;
	private long rechazadas;
	private long total;
	private int orden;
	
	
	public DonacionRangoEdadResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getRango() {
		return rango;
	}

	public void setRango(String rango) {
		this.rango = rango;
	}

	public long getAceptadas() {
		return aceptadas;
	}

	public void setAceptadas(long aceptadas) {
		this.aceptadas = aceptadas;
	}

	public long getRechazadas() {
		return rechazadas;
	}

	public void setRechazadas(long rechazadas) {
		this.rechazadas = rechazadas;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}
	
	public int getOrden() {
		return orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}


	
}
