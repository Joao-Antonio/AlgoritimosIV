package Ep0;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderText{
//	EP0
	
	public static void main(String[] args) {
		
		String path = "C:\\Users\\Hank\\eclipse-workspace\\Archives\\Ep0-Archives\\GreenLanternOath.txt";
		
		String txt = " ";
		
		try {
			FileReader archive = new FileReader(path);
			BufferedReader readerArch = new BufferedReader(archive);
			
			for (int countLine = 1; readerArch.ready(); countLine++) {
				txt = readerArch.readLine();
				System.out.println(countLine + " - " + txt);
			}
			
			archive.close();
			
		} catch (IOException e) {
			System.err.println("Erro em abrir o arquivo!");
			e.getMessage();
		}
	}
}
