package Test;

import org.junit.jupiter.api.BeforeEach;

import Clases.Hotel;



class TestCargarDatos {

	private Hotel hotel;
	
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
	
	
	 
}


