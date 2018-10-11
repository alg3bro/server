package edu.ucam.actions;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ucam.beans.Alumno;
import edu.ucam.servlet.Control;

public class BorrarAlumno extends Accion {

	@Override
	public synchronized void ejecutar(HttpServletRequest request, HttpServletResponse response) {
		

		String id = request.getParameter("id");
		Control.listaAlumno.remove(id);
		request.setAttribute("MSG", "Alumno eliminado Correctamente");
		
		
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
