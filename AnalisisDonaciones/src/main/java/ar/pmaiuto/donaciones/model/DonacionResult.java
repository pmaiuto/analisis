package ar.pmaiuto.donaciones.model;

public class DonacionResult {


	private String anio;
	private long habitualAceptado;
	private long habitualRechazado;
	private long nohabitualAceptado;
	private long noHabitualRechazado;
	private long primeraVezAceptado;	
	private long primeraVezRechazado;
	private long total;
	public DonacionResult() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public DonacionResult(String anio, long habitualAceptado, long habitualRechazado, long nohabitualAceptado,
			long noHabitualRechazado, long primeraVezAceptado, long primeraVezRechazado, long total) {
		super();
		this.anio = anio;
		this.habitualAceptado = habitualAceptado;
		this.habitualRechazado = habitualRechazado;
		this.nohabitualAceptado = nohabitualAceptado;
		this.noHabitualRechazado = noHabitualRechazado;
		this.primeraVezAceptado = primeraVezAceptado;
		this.primeraVezRechazado = primeraVezRechazado;
		this.total = total;
	}



	public String getAnio() {
		return anio;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	public long getHabitualAceptado() {
		return habitualAceptado;
	}
	public void setHabitualAceptado(long habitualAceptado) {
		this.habitualAceptado = habitualAceptado;
	}
	public long getHabitualRechazado() {
		return habitualRechazado;
	}
	public void setHabitualRechazado(long habitualRechazado) {
		this.habitualRechazado = habitualRechazado;
	}
	public long getNohabitualAceptado() {
		return nohabitualAceptado;
	}
	public void setNohabitualAceptado(long nohabitualAceptado) {
		this.nohabitualAceptado = nohabitualAceptado;
	}
	public long getNoHabitualRechazado() {
		return noHabitualRechazado;
	}
	public void setNoHabitualRechazado(long noHabitualRechazado) {
		this.noHabitualRechazado = noHabitualRechazado;
	}
	public long getPrimeraVezAceptado() {
		return primeraVezAceptado;
	}
	public void setPrimeraVezAceptado(long primeraVezAceptado) {
		this.primeraVezAceptado = primeraVezAceptado;
	}
	public long getPrimeraVezRechazado() {
		return primeraVezRechazado;
	}
	public void setPrimeraVezRechazado(long primeraVezRechazado) {
		this.primeraVezRechazado = primeraVezRechazado;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	
	
}
