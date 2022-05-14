package br.com.lab.impacta.account.domain.service;

import br.com.lab.impacta.account.domain.model.Account;


public interface AccountService {
	
	Account find(Long accountId);
	
	void Debit(Long accountId, Double valueOfDebit);
}
