/**package com.usuario.empresa.web.administracion.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.usuario.empresa.web.administracion.entidades.Cliente;
import com.usuario.empresa.web.administracion.servicios.ClienteService;


public class ClienteController extends MultiActionController {
	private List<Cliente> clientes = new ArrayList<Cliente>();

	private ClienteService service = null;
	private ApplicationContext ctx = null;

	/**
	
	public ClienteController() {
		Cliente cliente = null;
		// ciente 1
		cliente = new Cliente();
		cliente.setidCliente(4);
		cliente.setNombre("Jaime");
		cliente.setApellidoP("Pantoja");
		cliente.setApellidoM("Gomez");
		cliente.setdireccion("Avenida Real 1177");
		cliente.setemail("jaipan@123.com");
		cliente.settelefono(77952262);
		clientes.add(cliente);
		// cliente 1
		cliente = new Cliente();
		cliente.setidCliente(5);
		cliente.setNombre("Pia");
		cliente.setApellidoP("Zapata");
		cliente.setApellidoM("Retamal");
		cliente.setdireccion("Antigua Roma 65");
		cliente.setemail("piazap@123.com");
		cliente.settelefono(22576511);
		clientes.add(cliente);

		ctx = new ClassPathXmlApplicationContext(
				"classpath:/spring/applicationContext.xml");
		service = (ClienteService) ctx.getBean("clienteService");
	}

	
	public ModelAndView listar(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		
		List<Cliente> listaClientes = service.getClientes();
		
		return new ModelAndView("clientes/listar", "clientes", listaClientes);
	}

	
} * constructor
	 */
