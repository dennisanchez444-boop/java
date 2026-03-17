package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiantes;

	public Curso() {
		estudiantes = new ArrayList<>();
	}

	public Estudiante buscarEstudiantePorCedula(String cedula) {
		for (int i = 0; i < estudiantes.size(); i++) {
			Estudiante est = estudiantes.get(i);
			if (est.getCedula().equals(cedula))
				return est;
		}
		return null;
	}

	public void matricularEstudiante(Estudiante estudiante) {
		if (buscarEstudiantePorCedula(estudiante.getCedula()) != null) {
			System.out.println("Error: El estudiante ya está matriculado.");
			return;
		}
		estudiantes.add(estudiante);
		System.out.println("Estudiante matriculado correctamente.");
	}

	public double calcularPromedioCurso() {
		if (estudiantes.isEmpty())
			return 0;
		double suma = 0;
		for (int i = 0; i < estudiantes.size(); i++) {
			suma += estudiantes.get(i).calcularPromedioNotasEstudiante();
		}
		return suma / estudiantes.size();
	}

	public void mostrar() {
		for (int i = 0; i < estudiantes.size(); i++) {
			estudiantes.get(i).mostrar();
			System.out.println("------------------------");
		}
	}

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	
}