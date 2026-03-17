package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;

	public Estudiante(String cedula, String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.notas = new ArrayList<Nota>();
	}

	 public void agregarNota(Nota nuevaNota) {
	        if (nuevaNota.getCalificacion() < 0 || nuevaNota.getCalificacion() > 10) {
	            System.out.println("Error: La calificación debe estar entre 0 y 10.");
	            return;
	        }
	        for (int i = 0; i < notas.size(); i++) {
	            Nota nota = notas.get(i);
	            if (nota.getMateria().getCodigo().equals(nuevaNota.getMateria().getCodigo())) {
	                System.out.println("Error: Ya existe una nota para esa materia.");
	                return;
	            }
	        }
	        notas.add(nuevaNota);
	        System.out.println("Nota agregada correctamente.");
	    }

	public void modificarNota(String codigo, double nuevaNota) {
		if (nuevaNota < 0 || nuevaNota > 10) {
			System.out.println("Error: La calificación debe estar entre 0 y 10.");
			return;
		}
		boolean encontrada = false;
		for (int i = 0; i < notas.size(); i++) {
			Nota nota = notas.get(i);

			if (nota.getMateria().getCodigo().equals(codigo)) {
				nota.setCalificacion(nuevaNota);
				encontrada = true;
				System.out.println("Nota modificada correctamente.");
				break;
			}
		}
		if (!encontrada) {
			System.out.println("Error: No se encontró la materia con código " + codigo);
		}
	}

	public double calcularPromedioNotasEstudiante() {
		if (notas.size() == 0) {
			return 0;
		}
		double suma = 0;
		for (int i = 0; i < notas.size(); i++) {
			suma += notas.get(i).getCalificacion();
		}
		return suma / notas.size();
	}

	public void mostrar() {
		System.out.println("Estudiante: " + nombre + " " + apellido);

		for (int i = 0; i < notas.size(); i++) {
			Nota nota = notas.get(i);
			System.out.println("Materia: " + nota.getMateria().getNombre() + " | Código: "
					+ nota.getMateria().getCodigo() + " | Nota: " + nota.getCalificacion());
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}
}