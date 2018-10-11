package edu.ucam.servlet;

import java.io.IOException;
import java.util.Hashtable;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import edu.ucam.actions.Accion;
import edu.ucam.actions.AccionDesconocida;
import edu.ucam.actions.BorrarAlumno;
import edu.ucam.actions.BorrarCurso;
import edu.ucam.actions.CrearAlumno;
import edu.ucam.actions.CrearCurso;
import edu.ucam.actions.ModificarAlumno;
import edu.ucam.actions.ModificarCurso;
import edu.ucam.actions.ModificarRedireccion;
import edu.ucam.actions.ModificarRedireccionCurso;
import edu.ucam.beans.Alumno;
import edu.ucam.beans.Curso;

/**
 * Servlet implementation class Control
 */
@WebServlet("/Control")
public class Control extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Hashtable<String, Accion> listaAcciones = new Hashtable<String, Accion>();
	public static Hashtable<String, Alumno> listaAlumno = new Hashtable<String, Alumno>();
	public static Hashtable<String, Curso> listaCurso = new Hashtable<String, Curso>();
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Control() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String accion = request.getParameter("accion");
		if(listaAcciones.containsKey(accion)){
			listaAcciones.get(accion).ejecutar(request, response);
		}
		else{
			listaAcciones.get("DESCONOCIDA").ejecutar(request, response);
		}

		
	}

	@Override
	public void init() throws ServletException {
		

		System.out.println("Iniciando servidor...");
		
		listaAcciones.put("CREAR", new CrearAlumno());
		listaAcciones.put("DESCONOCIDA", new AccionDesconocida());
		listaAcciones.put("BORRAR", new BorrarAlumno());
		listaAcciones.put("MODIFICARREDIRECCION", new ModificarRedireccion());
		listaAcciones.put("MODIFICAR", new ModificarAlumno());
		
		listaAcciones.put("CREARCURSO", new CrearCurso());
		listaAcciones.put("BORRARCURSO", new BorrarCurso());
		listaAcciones.put("MODIFICARCURSOREDIRECCION", new ModificarRedireccionCurso());
		listaAcciones.put("MODIFICARCURSO", new ModificarCurso());
		
		
		super.init();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
