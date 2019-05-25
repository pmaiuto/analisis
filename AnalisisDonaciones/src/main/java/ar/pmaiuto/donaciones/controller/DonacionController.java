package ar.pmaiuto.donaciones.controller;

import java.io.IOException;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import ar.pmaiuto.donaciones.model.DonacionRangoEdadResult;
import ar.pmaiuto.donaciones.model.DonacionResult;
import ar.pmaiuto.donaciones.model.SexoDonacionResult;
import ar.pmaiuto.donaciones.service.DonacionService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class DonacionController {
	
	private static final Logger logger = LoggerFactory.getLogger(DonacionController.class);
	@Autowired
    private DonacionService donacionService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) throws IOException{
		logger.info("Welcome home! The client locale is {}.", locale);
					
		Long cantidad = donacionService.cantidadDonaciones();
		
		model.addAttribute("mensaje", donacionService.cantidadDonaciones() );
	
		if (cantidad > 100) 
		{
		  model.addAttribute("paginaIncluir","home");
		  return "principal";
		}
		else
		{
		  model.addAttribute("paginaIncluir","homeCarga");
		  return "principalCarga";
		}
		
		
	}
	@RequestMapping(value = "/donaciones", method = RequestMethod.GET)
	public String donaciones(Locale locale, Model model) throws IOException{
		
			
		List<DonacionResult> listaDonacionResultado = donacionService.listaDonacionResult();		
		
		model.addAttribute("paginaIncluir","donaciones");
		
		model.addAttribute("listaDonacionResultado", listaDonacionResultado );
		return "principal";
	}
		
	
	@RequestMapping(value = "/rangoEdad", method = RequestMethod.GET)
	public String rangoEdad(Locale locale, Model model) throws IOException{
		logger.info("Welcome home! The client locale is {}.", locale);
			
		List<DonacionRangoEdadResult> listaDonacionRangoEdad = donacionService.listaDonacionRangoEdadResult();
	
		model.addAttribute("paginaIncluir","donacionesRangoEdad");				
		model.addAttribute("listaDonacionRangoEdad", listaDonacionRangoEdad );
		return "principal";
	}
	
	@RequestMapping(value = "/sexoDonaciones", method = RequestMethod.GET)
	public String sexoDonaciones(Locale locale, Model model) throws IOException{
			
		
		List<SexoDonacionResult> listaSexoDonacionResultado = donacionService.listaSexoDonacionResult();	
		
		model.addAttribute("paginaIncluir","sexoDonaciones");
		
		model.addAttribute("listaSexoDonacionResultado", listaSexoDonacionResultado );
		return "principal";
	}
	
}
