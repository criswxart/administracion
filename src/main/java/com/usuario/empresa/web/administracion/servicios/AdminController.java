package com.usuario.empresa.web.vitivinicolaubb.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.usuario.empresa.web.vitivinicolaubb.entidades.Administrador;
import com.usuario.empresa.web.vitivinicolaubb.servicios.AdminService;


public class AdminController extends MultiActionController {
	private List<Administrador> admins = new ArrayList<Administrador>();

	private AdminService service = null;
	private ApplicationContext ctx = null;

	/**
	 * constructor
	 */
	public AdminController() {
		Administrador admin = null;
		
		admin = new Administrador();
		admin.setNombre("Pedro");
		admin.setApellidoP("Pineda");
		admin.setApellidoM("Mora");
		admin.setEmail("pedpin@123.com");
		admin.setidAdmin(1);
		
		ctx = new ClassPathXmlApplicationContext(
				"classpath:/spring/applicationContext.xml");
		service = (AdminService) ctx.getBean("clientesService");
	}

	
	public ModelAndView listar(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		
		List<Administrador> listaAdmins = service.getAdmins();
		
		return new ModelAndView("admins/listar", "admins", listaAdmins);
	}

	
