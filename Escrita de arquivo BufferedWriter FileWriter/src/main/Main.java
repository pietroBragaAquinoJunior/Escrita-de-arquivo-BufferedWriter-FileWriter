package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		/* Código em Java para escrita de arquivos com BufferedWriter, FileWriter usando Try-with-resources */
		
		String path = "D:\\TEMP\\escrever.txt";
		String[] linhas = new String[] {"Olá mundo", "Testando testando", "auhuahauh"};
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for (String linha : linhas) {
				bw.write(linha);
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
