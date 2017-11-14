package com.usuario.empresa.web.administracion.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.usuario.empresa.web.administracion.entidades.Productor;
import com.usuario.empresa.web.administracion.servicios.ProductorService;


public class ProductorController extends MultiActionController {
	private List<Productor> productores = new ArrayList<Productor>();

	private ProductorService service = null;
	private ApplicationContext ctx = null;

	/**
	 * constructor
	 */
	public ProductorController() {
		Productor productor = null;
	
		productor = new Productor();
		productor.setid_Productor(2);
		productor.setNombre("Jorge");
		productor.setApellidoP("Gatica");
		productor.setApellidoM("Guerra");
		productor.setdireccion("Acacios del norte 200");
		productor.setubicacion("Ninhue");
		productor.setemail("jorgat@123.com");
		productores.add(productor);
	
		productor = new Productor();
		productor.setid_Productor(3);
		productor.setNombre("Mercedes");
		productor.setApellidoP("Rubilar");
		productor.setApellidoM("Segura");
		productor.setdireccion("Los chincoles 375");
		productor.setubicacion("Portezuelo");
		productor.setemail("merrub@123.com")
		productores.add(productor);
		ctx = new ClassPathXmlApplicationContext(
				"classpath:/spring/applicationContext.xml");
		service = (ProductorService) ctx.getBean("productoresService");
	}

	
	public ModelAndView listar(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		
		List<Productor> listaProductores = service.getProductores();
		
		
		
		return new ModelAndView("usuarios/listar", "usuarios", listaUsuarios);
	}

	
	
}
