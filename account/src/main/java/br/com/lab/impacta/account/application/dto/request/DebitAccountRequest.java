package br.com.lab.impacta.account.application.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DebitAccountRequest {
	private double valueofDebit;

	public double getValueofDebit() {
		return valueofDebit;
	}

	public void setValueofDebit(double valueofDebit) {
		this.valueofDebit = valueofDebit;
	}
	
	
}
