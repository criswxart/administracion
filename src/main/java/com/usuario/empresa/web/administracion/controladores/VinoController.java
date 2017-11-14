//package com.usuario.empresa.web.administracion.controladores;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
//
//import com.usuario.empresa.web.administracion.entidades.Vino;
//import com.usuario.empresa.web.administracion.servicios.VinoService;
//
//
//public class VinoController extends MultiActionController {
//	private List<Vino> vinos = new ArrayList<Vino>();
//
//	private VinoService service = null;
//	private ApplicationContext ctx = null;
//
//	
//	public VinoController() {
//		Vino vino = null;
//		
//		vino = new Vino();
//		vino.cambiarStock(200);
//		vino.setidVino(1);
//		vino.setNombre("Izefué");
//		vino.setvalorDolar(16);
//		vino.setvalorEuro(14);
//		vino.setvalorCLP(10000);
//		vino.setidProductor(1);
//		vino.setidCepa(1);
//		vino.setidBotella(1);
//		vinos.add(vino);
//		
//		vino = new Vino();
//		vino.cambiarStock(150);
//		vino.setidVino(2);
//		vino.setNombre("Uvas del Sur");
//		vino.setvalorDolar(19);
//		vino.setvalorEuro(16);
//		vino.setvalorCLP(12000);
//		vino.setidProductor(2);
//		vino.setidCepa(1);
//		vino.setidBotella(1);
//		vinos.add(vino);
//		ctx = new ClassPathXmlApplicationContext(
//				"classpath:/spring/applicationContext.xml");
//		service = (VinoService) ctx.getBean("vinosService");
//	}
//
//	
//	public ModelAndView listar(HttpServletRequest request,
//			HttpServletResponse response) throws Exception {
//
//		
//		List<Vino> listaVinos = service.getVinos();
//		
//		return new ModelAndView("vinos/listar", "vinos", listaVinos);
//	}
//
//	
//	
//}
