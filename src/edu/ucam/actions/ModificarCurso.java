package edu.ucam.actions;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ucam.beans.Alumno;
import edu.ucam.beans.Curso;
import edu.ucam.servlet.Control;

public class ModificarCurso extends Accion {

	@Override
	public synchronized void ejecutar(HttpServletRequest request, HttpServletResponse response) {
		

		String nombre = request.getParameter("nombre");
		String edad =  request.getParameter("edad");
		String alumnos = request.getParameter("alumnos");
		String id = request.getParameter("id");
		
		Curso curso = Control.listaCurso.get(id);
		
		curso.setNombre(nombre);
		curso.setEdad(Integer.parseInt(edad));
		curso.setAlumnos(Integer.parseInt(alumnos));
			
		request.setAttribute("MSG", "Curso Modificado Correctamente");
		
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
