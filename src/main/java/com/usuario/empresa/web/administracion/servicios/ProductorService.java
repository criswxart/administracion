package com.usuario.empresa.web.administracion.servicios;

import java.util.List;

import com.usuario.empresa.web.administracion.entidades.Productor;



public class ProductorService extends ServiceImpl {
	
	@SuppressWarnings("unchecked")
	public List<Productor> getProductores() throws Exception {
		return (List<Productor>) sqlMap.queryForList("getProductores");
	}

		
	//public Productor validarProductor(int idEntrante) throws Exception {
	//	return (Productor) sqlMap.queryForObject("validarProductor", idEntrante );
	//}

}
