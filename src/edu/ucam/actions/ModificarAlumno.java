package edu.ucam.actions;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ucam.beans.Alumno;
import edu.ucam.servlet.Control;

public class ModificarAlumno extends Accion {

	@Override
	public synchronized void ejecutar(HttpServletRequest request, HttpServletResponse response) {
		

		String nombre = request.getParameter("nombre");
		String dni =  request.getParameter("dni");
		String nota = request.getParameter("nota");
		String id = request.getParameter("id");
		
		Alumno alumno = Control.listaAlumno.get(id);
		
		alumno.setNombre(nombre);
		alumno.setDni(dni);
		alumno.setNota(Integer.parseInt(nota));
			
		request.setAttribute("MSG", "Alumno Modificado Correctamente");
		
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
