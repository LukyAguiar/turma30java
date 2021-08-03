package Lista_I;

import java.util.Scanner;

public class T3_EventoFabrica {

	public static void main(String[] args)
	{
			int horas;
			int minutos;
			int segundos;
			int tempoEvento;
			Scanner gravar = new Scanner(System.in);
			
			
			
			//Entradas 
			System.out.println("Informe o tempo do evento na Fábrica :  ");
			tempoEvento = gravar.nextInt();
			
			horas = tempoEvento / 3600;
			minutos = (tempoEvento % 3600) / 60;
			segundos = (tempoEvento % 3600) % 60;
			
			System.out.println("Horas: " + horas);
			System.out.println("Minuto: " + minutos);
			System.out.println("Segundos: " + segundos);

	}
	
	
}
