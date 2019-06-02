package pack;

import java.io.IOException;

public class Mainn {

	public static void main(String[] args) throws IOException {
		String miPath = "C:\\Users\\samsung\\eclipse-workspace\\Aventureros\\src\\pack\\";
		Aventureros a1 = new Aventureros(miPath + "prueba.in");
		a1.encontrarMatero(a1);
	}

}
