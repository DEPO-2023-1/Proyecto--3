package GUI;

import javax.swing.JFrame;

import Clases.App;
import Clases.Grupo;
import Clases.Hotel;

import java.awt.*;


public class InterfazLogin extends JFrame{

    private PanelNorteLogin PanelNorte;
    private PanelCentroLogin PanelCentro;
    private PanelSurLogin PanelSur;
    private App app;

    public InterfazLogin(){
    	
        app = new App();
        PanelNorte = new PanelNorteLogin();
        PanelCentro = new PanelCentroLogin();
        PanelSur = new PanelSurLogin(this);


        setLayout(new BorderLayout());
		add(PanelNorte, BorderLayout.NORTH);
		add(PanelCentro, BorderLayout.CENTER);
		add(PanelSur, BorderLayout.SOUTH);
			
        setSize(new Dimension(1000, 650));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

    }
    public void login(int tipo) {
    	String usuario = PanelCentro.getTxtNum1();
    	String contrasena = PanelCentro.getTxtNum2();
        boolean ingreso = true;
    	//boolean ingreso = App.seleccionarUsuario(usuario, contrasena, tipo);

    	if (ingreso) {
            if (tipo == 1){
                InterfazMenuAdmin admin = new InterfazMenuAdmin();
            }
            if (tipo == 2){
                InterfazMenuRecep recep = new InterfazMenuRecep(this);
            }
            if (tipo == 3){
                InterfazMenuEmpleado admin = new InterfazMenuEmpleado();
            }
    		
            
    	
    	}
    }
    
    public String[] disponible(int inicialAnio, int inicialMes, int inicialDia, int finalAnio, int finalMes, int finalDia, int canNinos, int canAdultos) {
    	String[] respuesta = app.disponible(inicialAnio, inicialMes, inicialDia, finalAnio, finalMes, finalDia, canNinos, canAdultos);
    	return respuesta;
    }
    
    public Grupo newGrupo(int inicialAnio, int inicialMes, int inicialDia, int finalAnio, int finalMes, int finalDia, String IDHabitacion) {
    	 Grupo grupo = app.newGrupo(inicialAnio, inicialMes, inicialDia, finalAnio, finalMes, finalDia, IDHabitacion);
    	 return grupo;
    }
    
    public void agregarHuespedGrupo(Grupo grupo, String nombre, int cedula, int edad, String correo){
    	app.agregarHuespedGrupo(grupo, nombre, cedula, edad, correo);
    }
    
    public void crearReserva(Grupo grupo, int inicialAnio, int inicialMes, int inicialDia, int finalAnio, int finalMes, int finalDia, String IDHabitacion) {
    	app.crearReserva(grupo, inicialAnio, inicialMes, inicialDia, finalAnio, finalMes, finalDia, IDHabitacion);
    }
    
    public void cancelarReserva(int inicialAnio, int inicialMes, int inicialDia, int finalAnio, int finalMes, int finalDia, String IDHabitacion) {
    	app.cancelarReserva(inicialAnio, inicialMes, inicialDia, finalAnio, finalMes, finalDia, IDHabitacion);
    }
    
    
    public static void main(String [] args) {
        InterfazLogin ip = new InterfazLogin();
    }
}
