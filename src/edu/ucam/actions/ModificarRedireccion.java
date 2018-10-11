package edu.ucam.actions;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ucam.beans.Alumno;
import edu.ucam.beans.Curso;
import edu.ucam.servlet.Control;

public class ModificarRedireccion extends Accion {

	@Override
	public synchronized void ejecutar(HttpServletRequest request, HttpServletResponse response) {
		

		String id = request.getParameter("id");

		
		Alumno alumno = Control.listaAlumno.get(id);
		if(alumno!=null){
			request.setAttribute("alumno", alumno);
		}
		else{
			
			request.setAttribute("MSG", "Error");
			
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
		
		
		
		try {
			request.getRequestDispatcher("jsp/modificar.jsp").forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	

}
