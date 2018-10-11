package edu.ucam.actions;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ucam.beans.Alumno;
import edu.ucam.servlet.Control;

public class CrearAlumno extends Accion {

	@Override
	public synchronized void ejecutar(HttpServletRequest request, HttpServletResponse response) {
		
		//CAMBIAR EL STRING POR INT Y NOS AHORRAMOS EL PARSE INT????
		String nombre = request.getParameter("nombre");
		String dni =  request.getParameter("dni");
		String nota = request.getParameter("nota");
		
		Alumno alumno = new Alumno(nombre, nombre, dni, Integer.parseInt(nota));
		
		Control.listaAlumno.put(nombre, alumno);
		request.setAttribute("MSG", "Alumno Creado Correctamente");
		
		try {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	

}
