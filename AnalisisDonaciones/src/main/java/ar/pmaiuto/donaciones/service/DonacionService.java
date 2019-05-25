package ar.pmaiuto.donaciones.service;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.pmaiuto.donaciones.model.Donacion;
import ar.pmaiuto.donaciones.model.DonacionRangoEdadResult;
import ar.pmaiuto.donaciones.model.DonacionResult;
import ar.pmaiuto.donaciones.model.SexoDonacionResult;
import ar.pmaiuto.donaciones.model.SexoDonanteResult;
import ar.pmaiuto.donaciones.model.TipoDonanteResult;
import ar.pmaiuto.donaciones.repository.DonacionRepository;
//import org.springframework.transaction.annotation.Transactional;
 
@Service
public class DonacionService {
    @Autowired DonacionRepository repo;
    /* 
    public String home() {
        return "hola";
    }
    */
   public void guardar(Donacion d)  {
    		   	   
	   repo.save(d);        
        
    }
   
   public void llenarBase() throws IOException  {
   	
	   String SEPARATOR=";";
	   BufferedReader br = null;
	      
	    try {
	         
	    	 URL fileLocation = getClass().getClassLoader().getResource("donacionesCargar.csv");
	    	 System.out.println( fileLocation.getFile()  );
	    	 br =new BufferedReader(new FileReader(fileLocation.getFile()));
	      
	         String line = br.readLine();
	         while (null!=line) {
	            String [] fields = line.split(SEPARATOR);	          
	            
	            System.out.println(fields[0] + ", " + fields[1] + ", " + fields[2] + ", " + fields[3] + ", " + fields[4] + ", " + fields[5]);
	            
	            line = br.readLine();
	            
	            Donacion donacion = new Donacion();
	    		donacion.setNbolsa(fields[0]);
	    		donacion.setTipoDonacion(fields[1]);
	    		donacion.setTipoMuestra(fields[2]);
	    		
	    		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd-MM-yyyy");
	    		String strFecha = fields[3];
	    		Date fecha = null;	    		
	    		fecha = formatoDelTexto.parse(strFecha);
	    		donacion.setFechaDonacion(fecha);
	    		
	    		donacion.setLugar(fields[4]);
	    		donacion.setAutoexcluido(fields[5]);
	    		donacion.setEstado(fields[16]);
	    		donacion.setTipoDonante(fields[7]);
	    		donacion.setCodigoCancelacion(fields[8]);
	    		donacion.setSexoDonante(fields[9]);
	    		donacion.setFechaNacimiento(fields[10]);
	    		donacion.setCodigoDonante(fields[11]);	    		
	    			    		
	    		
	    		donacion.setEdadAlDonar((int)Integer.parseInt(fields[12]));	    		
	    		donacion.setAnioDonacion(fields[13]);
	            repo.save(donacion);
	            
	         }
	         
	      } catch (Exception e) {
	    	  System.out.println("Error al leer archivo");	    	 
	          e.printStackTrace();
	      } finally {
	         if (null!=br) {
	            br.close();
	         }
	      }
	      
    }
   
   public void eliminarDonaciones() {
   	
   	repo.deleteAll();
   	
       
       
   }
    
    public long cantidadDonaciones() {    	
    	          	
    	return repo.cantidadDonaciones();    	
        
    }
     
     
 public long prueba() {
    	    	
    
	 try {
			SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd-MM-yyyy");
			String strFechaInicio = "01-01-2015";
			Date fechaInicio = null;	    		
			fechaInicio = formatoDelTexto.parse(strFechaInicio);
			
			SimpleDateFormat formatoDelTextoFin = new SimpleDateFormat("dd-MM-yyyy");
			String strFechaFin = "01-01-2019";
			Date fechaFin = null;	    		
			fechaFin = formatoDelTextoFin.parse(strFechaFin);
    	
    	    return repo.listaTipoDonResult(fechaInicio,fechaFin).size();
    	
		 } catch (Exception e) {
	 	       System.out.println("Error al crear Fecha");	    	 
	         e.printStackTrace();
	         return (long) 0;
	     } 
        
    }
 
 public List<TipoDonanteResult> listaTipo() {
 	
 	
	 try {
			SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd-MM-yyyy");
			String strFechaInicio = "01-01-2015";
			Date fechaInicio = null;	    		
			fechaInicio = formatoDelTexto.parse(strFechaInicio);
			
			SimpleDateFormat formatoDelTextoFin = new SimpleDateFormat("dd-MM-yyyy");
			String strFechaFin = "01-01-2019";
			Date fechaFin = null;	    		
			fechaFin = formatoDelTextoFin.parse(strFechaFin);
 	  
 	        return repo.listaTipoDonResult(fechaInicio,fechaFin);
		 } catch (Exception e) {
	   	       System.out.println("Error al crear Fecha");	    	 
	           e.printStackTrace();
	           return null;
        } 
     
 }
 
 public List<DonacionResult> listaDonacionResult() {
	 	
	 	
 String anio = "2015";
   
 Long ha = (long) 0;
 Long hr = (long) 0;
 Long na = (long) 0;
 Long nr = (long) 0;
 Long pa = (long) 0;
 Long pr = (long) 0;
 int cantFilas = 0;
 int indice = 0;
    
 ArrayList<DonacionResult> listaDonaciones = new ArrayList<DonacionResult>();
    
 try {
	  SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd-MM-yyyy");
	  String strFechaInicio = "01-01-2015";
	  Date fechaInicio = null;	    		
	  fechaInicio = formatoDelTexto.parse(strFechaInicio);
		
	  SimpleDateFormat formatoDelTextoFin = new SimpleDateFormat("dd-MM-yyyy");
	  String strFechaFin = "01-01-2019";
	  Date fechaFin = null;	    		
	  fechaFin = formatoDelTextoFin.parse(strFechaFin);
		
	  List<TipoDonanteResult> lista = repo.listaTipoDonResult(fechaInicio,fechaFin);	
		
	  cantFilas = lista.size();
	
	  for (TipoDonanteResult elem: lista)
		{
			//System.out.println(elem.getAnio()+ "inicio ");
			indice = indice + 1;
			if (elem.getAnio().equals(anio))
			{  
			  // System.out.println("dentro"+elem.getAnio());
				
				if (indice < cantFilas)
				{
					ha = ha + sumar("HE",elem.getTipoDonante()+ elem.getEstado(),elem.getTotal());
					hr = hr + sumar("HR",elem.getTipoDonante()+ elem.getEstado(),elem.getTotal());
					na = na + sumar("NE",elem.getTipoDonante()+ elem.getEstado(),elem.getTotal());
					nr = nr + sumar("NR",elem.getTipoDonante()+ elem.getEstado(),elem.getTotal());
					pa = pa + sumar("PE",elem.getTipoDonante()+ elem.getEstado(),elem.getTotal());
					pr = pr + sumar("PR",elem.getTipoDonante()+ elem.getEstado(),elem.getTotal());
					System.out.println(elem.getTipoDonante()+" dentro "+elem.getTotal());
				}
				else
				{
					ha = ha + sumar("HE",elem.getTipoDonante()+ elem.getEstado(),elem.getTotal());
					hr = hr + sumar("HR",elem.getTipoDonante()+ elem.getEstado(),elem.getTotal());
					na = na + sumar("NE",elem.getTipoDonante()+ elem.getEstado(),elem.getTotal());
					nr = nr + sumar("NR",elem.getTipoDonante()+ elem.getEstado(),elem.getTotal());
					pa = pa + sumar("PE",elem.getTipoDonante()+ elem.getEstado(),elem.getTotal());
					pr = pr + sumar("PR",elem.getTipoDonante()+ elem.getEstado(),elem.getTotal());
					
					DonacionResult donacionRes= new DonacionResult();	
					donacionRes.setAnio(anio);
					donacionRes.setHabitualAceptado(ha);
					donacionRes.setHabitualRechazado(hr);
					donacionRes.setNohabitualAceptado(na);
					donacionRes.setNoHabitualRechazado(nr);
					donacionRes.setPrimeraVezAceptado(pa);
					donacionRes.setPrimeraVezRechazado(pr);
					listaDonaciones.add(donacionRes);
				}
				 
			
			
			}
			else
			{
				DonacionResult donacionRes= new DonacionResult();	
				donacionRes.setAnio(anio);
				donacionRes.setHabitualAceptado(ha);
				donacionRes.setHabitualRechazado(hr);
				donacionRes.setNohabitualAceptado(na);
				donacionRes.setNoHabitualRechazado(nr);
				donacionRes.setPrimeraVezAceptado(pa);
				donacionRes.setPrimeraVezRechazado(pr);
				
				
				listaDonaciones.add(donacionRes);
				System.out.println("dentro"+elem.getAnio());
				
				anio = elem.getAnio();
			    ha = (long) 0;
				hr = (long) 0;
				na = (long) 0;
				nr = (long) 0;
				pa = (long) 0;
				pr = (long) 0;
				  
				ha = ha + sumar("HE",elem.getTipoDonante()+ elem.getEstado(),elem.getTotal());
				hr = hr + sumar("HR",elem.getTipoDonante()+ elem.getEstado(),elem.getTotal());
				na = na + sumar("NE",elem.getTipoDonante()+ elem.getEstado(),elem.getTotal());
				nr = nr + sumar("NR",elem.getTipoDonante()+ elem.getEstado(),elem.getTotal());
				pa = pa + sumar("PE",elem.getTipoDonante()+ elem.getEstado(),elem.getTotal());
				pr = pr + sumar("PR",elem.getTipoDonante()+ elem.getEstado(),elem.getTotal());
			}
			
			
		 }
	 
	   return listaDonaciones; 
	
   } catch (Exception e) {
	       System.out.println("Error al crear Fecha");	    	 
      e.printStackTrace();
      return null;
   } 
 	
     
 }
 
 public List<DonacionRangoEdadResult> listaDonacionRangoEdadResult() {
	 	
	 	
	 try {
			SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd-MM-yyyy");
			String strFechaInicio = "01-01-2015";
			Date fechaInicio = null;	    		
			fechaInicio = formatoDelTexto.parse(strFechaInicio);
			
			SimpleDateFormat formatoDelTextoFin = new SimpleDateFormat("dd-MM-yyyy");
			String strFechaFin = "01-01-2019";
			Date fechaFin = null;	    		
			fechaFin = formatoDelTextoFin.parse(strFechaFin);
 	        
			Integer edadInicial = 18;
			Integer edadFinal = 30;
			
			ArrayList<DonacionRangoEdadResult> listaDonaciones = new ArrayList<DonacionRangoEdadResult>();
			
			for(int i=1;i<=5;i++)
	        {
				DonacionRangoEdadResult donacionRangoEdad= new DonacionRangoEdadResult();
				donacionRangoEdad.setRango(edadInicial+ " - " + edadFinal);
				donacionRangoEdad.setAceptadas(repo.cantidadDonacionesEdadesPorEstado(fechaInicio, fechaFin, edadInicial, edadFinal, "E"));
				donacionRangoEdad.setRechazadas(repo.cantidadDonacionesEdadesPorEstado(fechaInicio, fechaFin, edadInicial, edadFinal, "R"));
				donacionRangoEdad.setTotal(donacionRangoEdad.getAceptadas() + donacionRangoEdad.getRechazadas());
				donacionRangoEdad.setOrden(i);
				
				System.out.println("dentro"+donacionRangoEdad.getAceptadas());
				listaDonaciones.add(donacionRangoEdad);
				
				if(i == 1)
				{
					edadInicial = edadInicial + 12;
					edadFinal = edadFinal +10;
				}
				else if(i == 4)
				{
					edadInicial = edadInicial + 10;
					edadFinal = edadFinal + 40;
				}
				else 
				{
					edadInicial = edadInicial + 10;
					edadFinal = edadFinal +10;
					
				}
				
				System.out.println(edadInicial);
				System.out.println(edadFinal);
	        }
 	        
			
			return listaDonaciones;
		 } catch (Exception e) {
	   	       System.out.println("Error al crear Fecha");	    	 
	           e.printStackTrace();
	           return null;
        } 
     
 }
 
 public List<SexoDonacionResult> listaSexoDonacionResult() {
	 	
	 	
 String sexo = "F";
   
 Long ha = (long) 0;
 Long hr = (long) 0;
 Long na = (long) 0;
 Long nr = (long) 0;
 Long pa = (long) 0;
 Long pr = (long) 0;
 int cantFilas = 0;
 int indice = 0;
    
 ArrayList<SexoDonacionResult> listaDonaciones = new ArrayList<SexoDonacionResult>();
    
 try {
	  SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd-MM-yyyy");
	  String strFechaInicio = "01-01-2015";
	  Date fechaInicio = null;	    		
	  fechaInicio = formatoDelTexto.parse(strFechaInicio);
		
	  SimpleDateFormat formatoDelTextoFin = new SimpleDateFormat("dd-MM-yyyy");
	  String strFechaFin = "01-01-2019";
	  Date fechaFin = null;	    		
	  fechaFin = formatoDelTextoFin.parse(strFechaFin);
		
	  List<SexoDonanteResult> lista = repo.listaSexoDonResult(fechaInicio,fechaFin);	
		
	  cantFilas = lista.size();
	
	  for (SexoDonanteResult elem: lista)
		{
			System.out.println(elem.getSexoDonante()+ "inicio ");
			indice = indice + 1;
			if (elem.getSexoDonante().equals(sexo))
			{  
			  // System.out.println("dentro"+elem.getAnio());
				
				if (indice < cantFilas)
				{
					ha = ha + sumar("HE",elem.getTipoDonante()+ elem.getEstado(),elem.getTotal());
					hr = hr + sumar("HR",elem.getTipoDonante()+ elem.getEstado(),elem.getTotal());
					na = na + sumar("NE",elem.getTipoDonante()+ elem.getEstado(),elem.getTotal());
					nr = nr + sumar("NR",elem.getTipoDonante()+ elem.getEstado(),elem.getTotal());
					pa = pa + sumar("PE",elem.getTipoDonante()+ elem.getEstado(),elem.getTotal());
					pr = pr + sumar("PR",elem.getTipoDonante()+ elem.getEstado(),elem.getTotal());
					System.out.println(elem.getTipoDonante()+" dentro "+elem.getTotal());
				}
				else
				{
					ha = ha + sumar("HE",elem.getTipoDonante()+ elem.getEstado(),elem.getTotal());
					hr = hr + sumar("HR",elem.getTipoDonante()+ elem.getEstado(),elem.getTotal());
					na = na + sumar("NE",elem.getTipoDonante()+ elem.getEstado(),elem.getTotal());
					nr = nr + sumar("NR",elem.getTipoDonante()+ elem.getEstado(),elem.getTotal());
					pa = pa + sumar("PE",elem.getTipoDonante()+ elem.getEstado(),elem.getTotal());
					pr = pr + sumar("PR",elem.getTipoDonante()+ elem.getEstado(),elem.getTotal());
					
					SexoDonacionResult donacionRes= new SexoDonacionResult();	
					if (sexo.equals("F"))
					  donacionRes.setSexo("Femenino");
					else
					  donacionRes.setSexo("Masculino");
					
					donacionRes.setHabitualAceptado(ha);
					donacionRes.setHabitualRechazado(hr);
					donacionRes.setNohabitualAceptado(na);
					donacionRes.setNoHabitualRechazado(nr);
					donacionRes.setPrimeraVezAceptado(pa);
					donacionRes.setPrimeraVezRechazado(pr);
					listaDonaciones.add(donacionRes);
				}
				 
			
			
			}
			else
			{
				SexoDonacionResult donacionRes= new SexoDonacionResult();	
				if (sexo.equals("F"))
					donacionRes.setSexo("Femenino");
				else
					donacionRes.setSexo("Masculino");

				donacionRes.setHabitualAceptado(ha);
				donacionRes.setHabitualRechazado(hr);
				donacionRes.setNohabitualAceptado(na);
				donacionRes.setNoHabitualRechazado(nr);
				donacionRes.setPrimeraVezAceptado(pa);
				donacionRes.setPrimeraVezRechazado(pr);
				
				
				listaDonaciones.add(donacionRes);
				System.out.println("dentro"+elem.getSexoDonante());
				
				sexo = elem.getSexoDonante();
			    ha = (long) 0;
				hr = (long) 0;
				na = (long) 0;
				nr = (long) 0;
				pa = (long) 0;
				pr = (long) 0;
				  
				ha = ha + sumar("HE",elem.getTipoDonante()+ elem.getEstado(),elem.getTotal());
				hr = hr + sumar("HR",elem.getTipoDonante()+ elem.getEstado(),elem.getTotal());
				na = na + sumar("NE",elem.getTipoDonante()+ elem.getEstado(),elem.getTotal());
				nr = nr + sumar("NR",elem.getTipoDonante()+ elem.getEstado(),elem.getTotal());
				pa = pa + sumar("PE",elem.getTipoDonante()+ elem.getEstado(),elem.getTotal());
				pr = pr + sumar("PR",elem.getTipoDonante()+ elem.getEstado(),elem.getTotal());
			}
			
			
		 }
	 
	   return listaDonaciones; 
	
   } catch (Exception e) {
	       System.out.println("Error al crear Fecha");	    	 
      e.printStackTrace();
      return null;
   } 
 	
     
 }
 
 public long sumar(String estado,String tipo, long cantidad) {
	 	
	 if ( tipo.equals("HE") && estado.equals("HE"))
	 {
		  return cantidad;
	 }
	 if (tipo.equals("HR")&& estado.equals("HR"))
	 {
		  return cantidad;
	 }
	 if (tipo.equals("NE") && estado.equals("NE"))
	 {
		  return cantidad;
	 }
	 if (tipo.equals("NR") && estado.equals("NR"))
	 {
		  return cantidad;
	 }
	 if (tipo.equals("PE") && estado.equals("PE"))
	 {
		  return cantidad;
	 }
	 if (tipo.equals("PR") && estado.equals("PR"))
	 {
		  return cantidad;
	 }
	 
	 
   return (long) 0;
 	
     
 }
   
     
}
