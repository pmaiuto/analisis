package ar.pmaiuto.donaciones.model;

public class SexoDonacionResult {
	
	private String sexo;
	private long habitualAceptado;
	private long habitualRechazado;
	private long nohabitualAceptado;
	private long noHabitualRechazado;
	private long primeraVezAceptado;	
	private long primeraVezRechazado;
	private long total;
	
	public SexoDonacionResult() {
		super();
		// TODO Auto-generated constructor stub
		
		
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
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
