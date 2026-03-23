package com.cmc.evaluacion.entidades.servicios;

import java.util.ArrayList;
import com.cmc.evaluacion.entidades.Cliente;
import com.cmc.evaluacion.entidades.Prestamo;

public class Banco {
	private ArrayList<Prestamo> prestamos;
	private ArrayList<Cliente> clientes;

	public Banco() {
		prestamos = new ArrayList<>();
		clientes = new ArrayList<>();
	}

	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;

	}

	public Cliente buscarCliente(String cedula) {

		for (int i = 0; i < clientes.size(); i++) {
			Cliente c = clientes.get(i);

			if (c.getCedula().equals(cedula)) {
				return c;
			}
		}

		return null;
	}

	public void registrarCliente(Cliente cliente) {

	    Cliente existente = buscarCliente(cliente.getCedula());

	    if (existente == null) {
	        clientes.add(cliente);
	        System.out.println("Cliente registrado: " + cliente.mostrarCliente());
	    } else {
	        System.out.println("Cliente ya existe: " + existente.getCedula());
	    }
	}
	
	public void asignarPrestamo(String cedula, Prestamo prestamo) {

	    Cliente cliente = buscarCliente(cedula);

	    if (cliente == null) {
	        System.out.println("No es cliente del banco");
	        return;
	    }

	    CalculadoraAmortizacion calc = new CalculadoraAmortizacion();
	    calc.generarTabla(prestamo);
	    prestamo.setCliente(cliente);
	    prestamos.add(prestamo);

	    System.out.println("Préstamo asignado a: " + cliente.mostrarCliente());
	}
	
	public ArrayList<Prestamo> buscarPrestamos(String cedula) {

	    ArrayList<Prestamo> resultado = new ArrayList<>();

	    for (int i = 0; i < prestamos.size(); i++) {
	        Prestamo p = prestamos.get(i);

	        if (p.getCliente().getCedula().equals(cedula)) {
	            resultado.add(p);
	        }
	    }

	    if (resultado.isEmpty()) {
	        return null;
	    }

	    return resultado;
	}
}
