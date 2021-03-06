package pe.edu.sistemas.sismatricula.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pe.edu.sistemas.sismatricula.domain.Periodo;
import pe.edu.sistemas.sismatricula.model.RegAlumno;
import pe.edu.sistemas.sismatricula.service.PeriodoService;

@Controller
@RequestMapping("/modulos")
public class GeneralController {
	
	
	@Autowired
	public PeriodoService periodoservice;
	
	protected final Log logger = LogFactory.getLog(GeneralController.class);
	
	@ModelAttribute("listaPeriodo")
	public List<String> listaPeriodo(){		
		List<String> periodosnombre = null;		
		List<Periodo> periodos = periodoservice.listarperiodos();	
		periodosnombre = periodoservice.obtenerNombresPeriodos(periodos);
		return periodosnombre;
	}
	
	@ModelAttribute("listaPeriodoIni")
	public List<String> listaPeriodoIni(){		
		List<String> periodosnombre = null;		
		List<Periodo> periodos = periodoservice.listarperiodosini();	
		periodosnombre = periodoservice.obtenerNombresPeriodos(periodos);
		return periodosnombre;
	}
	
	@ModelAttribute("listaTipoTramite")
	public List<String> listaTipoTramite(){
		List<String> listaTipoTramite = new ArrayList<>();
		listaTipoTramite.add("Reserva");
		listaTipoTramite.add("Reactualizacion");
		System.out.println(listaTipoTramite.toString());
		return listaTipoTramite;
	}
	

	
	@GetMapping(value="/registro")
	public ModelAndView registro(){
		return new ModelAndView("modulos/registro").addObject("optSelect","registro");
	}
	
	@GetMapping(value="/carga")
	public ModelAndView carga(){
		return new ModelAndView("modulos/carga").addObject("optSelect","carga");
	}
	
	
	
}