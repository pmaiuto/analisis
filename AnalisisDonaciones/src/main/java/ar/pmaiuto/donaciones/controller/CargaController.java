package ar.pmaiuto.donaciones.controller;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.pmaiuto.donaciones.model.DonacionResult;
import ar.pmaiuto.donaciones.service.AboService;
import ar.pmaiuto.donaciones.service.DonacionService;

@Controller
public class CargaController {
	
	//private static final Logger logger = LoggerFactory.getLogger(DonacionController.class);
	@Autowired
    private AboService aboService;
	@Autowired
    private DonacionService donacionService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/cargarDatosInicio", method = RequestMethod.GET)
	public ModelAndView cargarDatosInicio(Locale locale, Model model) throws IOException{
						       		
		model.addAttribute("mensaje", donacionService.cantidadDonaciones() );			
		
		ModelAndView miModelo = new ModelAndView("principal");		
        miModelo.addObject("mensaje", donacionService.cantidadDonaciones());      
        miModelo.addObject("paginaIncluir", "homeCarga");        

        return miModelo;
	}
	
	
	@RequestMapping(value = "/cargarDatos", method = RequestMethod.GET)
	public ModelAndView cargarDatos(Locale locale, Model model) throws IOException{
						
		aboService.llenarBase();
		donacionService.llenarBase();
		
	    List<DonacionResult> listaDonacionResultado = donacionService.listaDonacionResult();			
				
		
		ModelAndView miModelo = new ModelAndView("principal");		
        miModelo.addObject("mensaje", donacionService.cantidadDonaciones());
        miModelo.addObject("listaDonacionResultado", listaDonacionResultado);
        miModelo.addObject("paginaIncluir", "donaciones");        

        return miModelo;
	}
	
	@RequestMapping(value = "/eliminarDatos", method = RequestMethod.GET)
	public ModelAndView eliminarDatos(Locale locale, Model model) throws IOException{
						
		aboService.eliminarTodos();;
		donacionService.eliminarDonaciones();		
		
		ModelAndView miModelo = new ModelAndView("principal");		
        miModelo.addObject("mensaje", donacionService.cantidadDonaciones());
        miModelo.addObject("paginaIncluir", "donaciones");        

        return miModelo;
	}
    
}
