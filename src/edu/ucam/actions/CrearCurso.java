package edu.ucam.actions;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ucam.beans.Alumno;
import edu.ucam.beans.Curso;
import edu.ucam.servlet.Control;

public class CrearCurso extends Accion {

	@Override
	public synchronized void ejecutar(HttpServletRequest request, HttpServletResponse response) {
		
		//CAMBIAR EL STRING POR INT Y NOS AHORRAMOS EL PARSE INT????
		String nombre = request.getParameter("nombre");
		String edad =  request.getParameter("edad");
		String alumnos = request.getParameter("alumnos");
		
		Curso curso = new Curso(nombre, nombre, Integer.parseInt(edad), Integer.parseInt(alumnos));
		
		Control.listaCurso.put(nombre, curso);
		request.setAttribute("MSG", "Curso Creado Correctamente");
		
		try {
			request.getRequestDispatcher("index_cursos.jsp").forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	

}
