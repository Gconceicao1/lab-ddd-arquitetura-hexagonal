package br.com.lab.impacta.account.application.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.lab.impacta.account.application.AccountApplication;
import br.com.lab.impacta.account.application.adpter.AccountAdapter;
import br.com.lab.impacta.account.application.dto.request.DebitAccountRequest;
import br.com.lab.impacta.account.application.dto.response.AccountBalanceResponse;
import br.com.lab.impacta.account.application.dto.response.DebitAccountResponse;
import br.com.lab.impacta.account.domain.model.Account;
import br.com.lab.impacta.account.domain.service.AccountService;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class AccountApplicationImpl implements AccountApplication{
 
	@Autowired
	private AccountService accountService;
	
	@Override
	public AccountBalanceResponse getBalance(Long accountId) {

		Account account = accountService.find(accountId);
		
		return AccountAdapter.toDoBalance(account);
	}

	@Override
	public DebitAccountResponse debit(Long accountId, DebitAccountRequest debitAccountRequest) {
		accountService.Debit(accountId, debitAccountRequest.getValueofDebit());
		return new DebitAccountResponse(true);
	}

}
