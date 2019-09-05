package ufpb.poo.biblioteca;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Datas {

	private Calendar data_prevista_entrega;
	private Calendar dataEmprestimo;
	private Calendar data_da_devolucao;
	private final int quantidadeDias = 15;

	public Datas() {
		super();
		this.data_prevista_entrega = null;
		this.dataEmprestimo = null;
		this.data_da_devolucao = null;
	}

	public void gerarData_de_entrega() {

		dataEmprestimo.add((GregorianCalendar.DAY_OF_MONTH), this.quantidadeDias);
		this.data_prevista_entrega = dataEmprestimo;

		dataEmprestimo = Calendar.getInstance();
	}

	public boolean vaiTerMulta() {

		if (data_prevista_entrega.after(this.data_da_devolucao)) { // Se o dia da entrega for depois que o dia que a
																	// pessoa está devolvendo
			return true;
		}
		return false;
	}

	@SuppressWarnings("deprecation")
	public double gerarMulta() {

		int dia_De_Atraso = 0;

		int dataQueDevolveu = data_da_devolucao.getTime().getDate();
		int dataPrevistaPraEntregar = data_prevista_entrega.getTime().getDate();
		int mes_Da_Entrega = data_da_devolucao.getTime().getMonth();
		int mes_queDeveria_Entregar = data_prevista_entrega.getTime().getMonth();

		if (mes_Da_Entrega != mes_queDeveria_Entregar) {
			dia_De_Atraso = (data_da_devolucao.getActualMaximum(Calendar.DAY_OF_MONTH) - dataQueDevolveu) + dataPrevistaPraEntregar;
		} else {
			dia_De_Atraso = Math.abs(dataQueDevolveu - dataPrevistaPraEntregar);
		}
		
		return dia_De_Atraso * 1.30;
	}

	public Calendar getData_prevista_entrega() {
		return data_prevista_entrega;
	}

	public void setData_prevista_entrega(Calendar data_prevista_entrega) {
		this.data_prevista_entrega = data_prevista_entrega;
	}

	public Calendar getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Calendar dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public Calendar getData_da_devolucao() {
		return data_da_devolucao;
	}

	public void setData_da_devolucao(Calendar data_da_devolucao) {
		this.data_da_devolucao = data_da_devolucao;
	}

	public int getQuantidadeDias() {
		return quantidadeDias;
	}
}
