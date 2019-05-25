package ar.pmaiuto.donaciones.repository;

import java.util.List;

import ar.pmaiuto.donaciones.model.Abo;
import ar.pmaiuto.donaciones.model.ResultAbo;

public interface CustomAbo {
	
	public long  cantidadDonaciones();
	public List<Abo>  aboPatron(String patron);
	
	public List<ResultAbo>  listaGrupoFactor();
	

}
