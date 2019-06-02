package pack;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Aventureros {
	int N;
	int[] vec;

	public Aventureros(String path) throws FileNotFoundException {
		leerArchivo(path);
	}

	public void leerArchivo(String path) throws FileNotFoundException {

		Scanner sc = new Scanner(new File(path));
		sc.useLocale(Locale.ENGLISH);
		this.N = sc.nextInt();
		vec = new int[N - 1];
		for (int i = 0; i < this.N - 1; i++) {
			this.vec[i] = sc.nextInt();
		}
		sc.close();

	}

	public void escribirArchivo(ArrayList<Integer> a1, int[] vec,int N) throws IOException {
		String miPath = "C:\\Users\\samsung\\eclipse-workspace\\Aventureros\\src\\pack\\";
		PrintWriter salida = new PrintWriter(new FileWriter(miPath + "prueba.out"));
		
		
		for(int i=0;i<N-1;i++) {
		salida.print(vec[i]+" ");
		}
		salida.println("");
		salida.print(a1.get(0));
		
		salida.close();
	}
	public void encontrarMatero(Aventureros a1) throws IOException {
	//	int[] oias = new int[N];
		ArrayList<Integer> oias = new ArrayList<Integer>();
		int[] eliminados = new int[a1.N - 1];
		int pasarMate = 0;
		int j = 0;
		int pos=0;
		int TAM = a1.N;
		for (int i = 1; i <= a1.N; i++) {
			oias.add(i);
		}
		

		while (TAM != 1) {

			pasarMate = a1.vec[j];
			pos=(int) ((pos+pasarMate)%TAM);
			
			eliminados[j] = oias.get(pos);
			oias.remove(pos);
			
			j++;
			TAM--;
		}
		escribirArchivo(oias,eliminados,a1.N);
	}

}
