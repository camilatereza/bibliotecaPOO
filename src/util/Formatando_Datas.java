package util;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class Formatando_Datas {

	private static Calendar data_prevista_entrega;
	private static Calendar dataEmprestimo;
	private static Calendar data_da_devolucao;
	private static final int quantidadeDias = 15;

	public static void main(String[] args) throws ParseException {
//
//		// Cria um formatador para a data usando DateFormat:
//		DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
//		Calendar gc = Calendar.getInstance();
//		System.out.println(df.format(gc.getTime())); // 14/03/2016
//
//		// Adiciona 10 dias:
//		gc.add((GregorianCalendar.DAY_OF_MONTH), 10);
//		System.out.println(df.format(gc.getTime())); // 24/03/2016
		
		
		

//		DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		Calendar gc = Calendar.getInstance();
		Calendar gf = Calendar.getInstance();
		
		gc.add((GregorianCalendar.DAY_OF_MONTH), 4);
		System.out.println(gc.getTime());
		System.out.println(gf.getTime());
		
		data_prevista_entrega = gc;
		data_da_devolucao = gf;
		
		if (vaiTerMulta()) {
			int diasAtrasado = 0;
			double multa = 0;
			int dia = data_da_devolucao.getTime().getDate();
			int outroDia = data_prevista_entrega.getTime().getDate();
			int mes = data_da_devolucao.getTime().getMonth() + 1;
			int outroMes = data_prevista_entrega.getTime().getMonth() + 1;
			
			System.out.println("1 dia: " + dia);
			System.out.println("2 dia: " + outroDia);
			System.out.println("1 mes:" + mes);
			System.out.println("2 mes:" + outroMes);
			
			if (mes != outroMes) {
				diasAtrasado = (data_da_devolucao.getActualMaximum(Calendar.DAY_OF_MONTH) - dia) + outroDia;
				multa = diasAtrasado * 1.30;
				System.out.printf("Voc� atrasou "+ diasAtrasado + " dias, sua multa � de: R$%.2f", multa);
			} else {
				diasAtrasado = Math.abs(dia - outroDia);
				multa = diasAtrasado * 1.30;
				System.out.printf("Voc� atrasou "+ diasAtrasado + " dias, sua multa � de: R$%.2f", multa);
			}

		}

	}

	public static boolean vaiTerMulta() {
		if (data_prevista_entrega.after(data_da_devolucao)) { // Se o dia da entrega for depois que o dia que // pessoa
																// est� devolvendo
			return true;
		}
		return false;
	}
}
