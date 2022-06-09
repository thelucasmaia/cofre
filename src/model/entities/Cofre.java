package model.entities;

import model.exception.DomainException;

public class Cofre {

	private double dinheiro;
	private double dinheiroGuardadoNoCofre;
	
	public Cofre() {
	}
	
	public double getDinheiro() {
		return dinheiro;
	}

	public double getDinheiroGuardadoNoCofre() {
		return dinheiroGuardadoNoCofre;
	}

	public void depositarDinheiro(double quantidadeParaDepositar) {
		dinheiroGuardadoNoCofre += quantidadeParaDepositar;
	}
	
	public void sacarDinheiro(double quantidadeParaSacar) {
		if (quantidadeParaSacar > dinheiroGuardadoNoCofre) {
			throw new DomainException("A quantia solicitada ultrapassa o valor guardado");
		}
		else {
		dinheiroGuardadoNoCofre -= quantidadeParaSacar;
		}
	}
}
