package Test;



import Clases.Habitacion;
import Clases.Hotel;
import Clases.Inventario;
import Clases.MenuRestaurante;
import Clases.Servicio;
import Clases.Temporada;






class TestCargarDatos {

	private Hotel hotel;
	/*
	@BeforeEach
	public void SetUp() {
		
		try {
			this.hotel = new Hotel();
		}
		catch(Exception e) {
			System.out.println("error al crear Discotienda");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}	
	}
	
	
	@Test
	@DisplayName("Carga Datos")
	public void testCargaDatos() throws IOException {
		try {
		hotel.cargarHotel("ProyectoHotel/ProyectoHotel/HOtel.java/data/Test/Habitaciones.txt",
				"ProyectoHotel/ProyectoHotel/HOtel.java/data/Test/Inventario.txt",
				"ProyectoHotel/ProyectoHotel/HOtel.java/data/Test/Servicios.txt",
				"ProyectoHotel/ProyectoHotel/HOtel.java/data/Test/Restaurante.txt",
				"ProyectoHotel/ProyectoHotel/HOtel.java/data/Test/Temporada.txt");
		}catch(IOException e) {
			System.out.println(e);
		}
		
		ArrayList<Habitacion> habitaciones = hotel.getHabitaciones();
		ArrayList<Inventario> inventario = hotel.getInventarios();
		ArrayList<Servicio> servicios = hotel.getServicios();
		ArrayList<MenuRestaurante> productos = hotel.getProductos();
		ArrayList<Temporada> temporada = habitaciones.get(0).getTemporadas();
		
		String habPrueba = habitaciones.get(0).getIdHabitacion();
		String invPrueba = inventario.get(0).getProducto();
		String serPrueba = servicios.get(0).getNombre();
		String resPrueba = productos.get(0).getNombre();
		float temPrueba = temporada.get(1).getAumento();	
		
		assertAll(
        		()-> assertEquals("0001", habPrueba),
        		()-> assertEquals("carne", invPrueba),
        		()-> assertEquals("espa", serPrueba),
        		()-> assertEquals("carne", resPrueba),
        		()-> assertEquals(1, temPrueba)
        		);
	}
	*/
	
	
}


