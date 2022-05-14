package br.com.lab.impacta.account.application.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DebitAccountResponse {
	
	public DebitAccountResponse(boolean b) {
		this.debited = b;
	}

	private boolean debited;

	public boolean isDebited() {
		return debited;
	}

	public void setDebited(boolean debited) {
		this.debited = debited;
	}
	
	
	
}
