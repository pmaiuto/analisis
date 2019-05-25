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
import org.springframework.web.servlet.ModelAndView;

import ar.pmaiuto.donaciones.model.RegistroGrafico;
import ar.pmaiuto.donaciones.model.ResultAbo;
import ar.pmaiuto.donaciones.service.AboService;

import java.util.ArrayList;



@Controller
public class AboController {
	
	
	
	private static final Logger logger = LoggerFactory.getLogger(DonacionController.class);
	@Autowired
    private AboService aboService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/abo", method = RequestMethod.GET)
	public ModelAndView abo(Locale locale, Model model) throws IOException{
		logger.info("Welcome aboooooo! The client locale is {}.", locale);
							
		ModelAndView miModelo = new ModelAndView("principal");		
        miModelo.addObject("mensaje", aboService.home());
        miModelo.addObject("paginaIncluir", "abo");        

        return miModelo;
	}

	
	
	@RequestMapping(value = "/aboGroup", method = RequestMethod.GET)
	public String aboGroup(Locale locale, Model model) throws IOException{
		logger.info("Welcome cargando! The client locale is {}.", locale);
		
		List <RegistroGrafico> listaGrafico;

	    
		listaGrafico = new ArrayList<RegistroGrafico>();
	    
				
		List<ResultAbo> respuesta = aboService.listaGrupoFactor();
		
		model.addAttribute("mensaje", aboService.home() );	
		model.addAttribute("cantidad", respuesta.size() );	
		model.addAttribute("listaAbo", respuesta );	
		
		for (ResultAbo p: respuesta) {
			 System.out.println(p.getTotal());
			 RegistroGrafico reg =new RegistroGrafico();
			 reg.setClave(p.getGrupo() + p.getFactor());
			 reg.setValor(p.getTotal());
			 listaGrafico.add(reg);
			
			
			 }
		
		for (RegistroGrafico r: listaGrafico) {
			 System.out.println(r.getClave());
			 System.out.println(r.getValor());
			
			
			
			 }
		model.addAttribute("listaGraf",listaGrafico);
		model.addAttribute("paginaIncluir","abo");
		model.addAttribute("cantidadRegistros",listaGrafico.size());
		
		return "principal";
	}
	
	
	

}
