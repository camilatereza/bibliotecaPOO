package testes;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Formatando_Datas {

	public static void main(String[] args) throws ParseException {
//		Calendar c = Calendar.getInstance();
//		c.set(2019, Calendar.FEBRUARY, 28);
//		Date data = c.getTime();
//		System.out.println("Data atual sem formatação: " + data);
//
//		// Formata a data
//		DateFormat formataData = DateFormat.getDateInstance();
//
//		String dataAtual = formataData.format(data);
//		DateFormat dataAtualDate = DateFormat.getDateTimeInstance();	
//		
//		System.out.println(dataAtual);

		Calendar c = Calendar.getInstance();
		Date data = c.getTime();
		DateFormat f = DateFormat.getDateInstance();

		Date data2 = f.parse("12/01/1995");
		System.out.println(data2);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		// Converte Objetosx
		String dataAtual = f.format(data);
		System.out.println("Data convertida:" + sdf.parse(dataAtual));
		System.out.println(sdf.parse(dataAtual).getClass());
	}

}
