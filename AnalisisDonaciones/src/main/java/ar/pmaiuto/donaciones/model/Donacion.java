package ar.pmaiuto.donaciones.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "donacion")
public class Donacion {
	@Id
	private String id;
	private String nbolsa;
	private String tipoDonacion;
	private String tipoMuestra;
	private Date fechaDonacion;
	private String lugar;
	private String autoexcluido;
	private String estado;
	private String tipoDonante;
	private String codigoCancelacion;
	private String sexoDonante;
	private String fechaNacimiento;	
	private String codigoDonante;	
	private Integer edadAlDonar;
	private String anioDonacion;
		



	public String getAnioDonacion() {
		return anioDonacion;
	}




	public void setAnioDonacion(String anioDonacion) {
		this.anioDonacion = anioDonacion;
	}




	public Donacion() {
		super();
		// TODO Auto-generated constructor stub
	}




	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}




	public String getNbolsa() {
		return nbolsa;
	}




	public void setNbolsa(String nbolsa) {
		this.nbolsa = nbolsa;
	}




	public String getTipoDonacion() {
		return tipoDonacion;
	}




	public void setTipoDonacion(String tipoDonacion) {
		this.tipoDonacion = tipoDonacion;
	}




	public String getTipoMuestra() {
		return tipoMuestra;
	}




	public void setTipoMuestra(String tipoMuestra) {
		this.tipoMuestra = tipoMuestra;
	}




	public Date getFechaDonacion() {
		return fechaDonacion;
	}




	public void setFechaDonacion(Date fechaDonacion) {
		this.fechaDonacion = fechaDonacion;
	}




	public String getLugar() {
		return lugar;
	}




	public void setLugar(String lugar) {
		this.lugar = lugar;
	}




	public String getAutoexcluido() {
		return autoexcluido;
	}




	public void setAutoexcluido(String autoexcluido) {
		this.autoexcluido = autoexcluido;
	}




	public String getEstado() {
		return estado;
	}




	public void setEstado(String estado) {
		this.estado = estado;
	}




	public String getTipoDonante() {
		return tipoDonante;
	}




	public void setTipoDonante(String tipoDonante) {
		this.tipoDonante = tipoDonante;
	}




	public String getCodigoCancelacion() {
		return codigoCancelacion;
	}




	public void setCodigoCancelacion(String codigoCancelacion) {
		this.codigoCancelacion = codigoCancelacion;
	}




	public String getSexoDonante() {
		return sexoDonante;
	}




	public void setSexoDonante(String sexoDonante) {
		this.sexoDonante = sexoDonante;
	}




	public String getFechaNacimiento() {
		return fechaNacimiento;
	}




	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	
	public Integer getEdadAlDonar() {
		return edadAlDonar;
	}




	public void setEdadAlDonar(Integer edadAlDonar) {
		this.edadAlDonar = edadAlDonar;
	}

	public String getCodigoDonante() {
		return codigoDonante;
	}




	public void setCodigoDonante(String codigoDonante) {
		this.codigoDonante = codigoDonante;
	}
	

	

}
