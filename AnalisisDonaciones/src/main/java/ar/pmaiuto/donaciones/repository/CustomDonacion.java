package ar.pmaiuto.donaciones.repository;

import java.util.Date;
import java.util.List;

import ar.pmaiuto.donaciones.model.SexoDonanteResult;
import ar.pmaiuto.donaciones.model.TipoDonanteResult;

public interface CustomDonacion {
	
	public long  cantidadDonaciones();
	
	public List<TipoDonanteResult> listaTipoDonResult(Date fechaInicio,Date fechaFin);
	
	public long cantidadDonacionesEdadesPorEstado(Date fechaInicio,Date fechaFin,int edadInicio,int edadFin,String estado);
	
	public List<SexoDonanteResult> listaSexoDonResult(Date fechaInicio,Date fechaFin);

}
