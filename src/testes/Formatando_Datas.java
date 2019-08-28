package testes;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import java.util.GregorianCalendar;
import java.text.DateFormat;
import java.util.Calendar;

public class Formatando_Datas {

	public static void main(String[] args) throws ParseException {

		// Cria um formatador para a data usando DateFormat:
		DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		Calendar gc = Calendar.getInstance();
		System.out.println(df.format(gc.getTime())); // 14/03/2016

		// Adiciona 10 dias:
		gc.add((GregorianCalendar.DAY_OF_MONTH), 10);
		System.out.println(df.format(gc.getTime())); // 24/03/2016
	}

}
