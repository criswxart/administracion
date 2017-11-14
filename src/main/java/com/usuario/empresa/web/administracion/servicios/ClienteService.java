//package com.usuario.empresa.web.administracion.servicios;
//
//import java.util.List;
//
//import com.usuario.empresa.web.administracion.entidades.Cliente;
//
//
//
//public class ClienteService extends ServiceImpl {
//	
//	@SuppressWarnings("unchecked")
//	public List<Cliente> getClientes() throws Exception {
//		return (List<Cliente>) sqlMap.queryForList("getClientes");
//	}
//
//	public Cliente validarCliente(int idEntrante) throws Exception {
//		return (Cliente) sqlMap.queryForObject("validarCliente", admin);
//	}
//	
//	public int obtenerNumeroClientes() throws Exception{
//		//no estaba seguro de poner queryForObject o queryForInt
//		return (int) sqlMap.queryForObject("obtenerNumeroClientes");
//	}
//	
//	public void eliminarCliente(int idCliente) throws Exception {
//		sqlMap.delete("eliminarCliente", idUsuario);
//	}
//}
