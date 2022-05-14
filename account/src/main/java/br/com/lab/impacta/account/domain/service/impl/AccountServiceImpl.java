package br.com.lab.impacta.account.domain.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import br.com.lab.impacta.account.domain.exception.AccountNotFoundExeption;
import br.com.lab.impacta.account.domain.model.Account;
import br.com.lab.impacta.account.domain.service.AccountService;
import br.com.lab.impacta.account.infrastructure.repository.AccountRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private AccountRepository accountRepository;
	
	  @Value("${lab.account.exceptions.account-dont-exists-message}")
	    private String messageExceptionAccountNotFound;

	    @Value("${lab.account.exceptions.account-dont-exists-description}")
	    private String descriptionExceptionAccountNotFound;

	
	@Override
	public Account find(Long accountId) {
		Optional<Account> account = accountRepository.findById(accountId);
		
		if(account.isEmpty())
			throw new AccountNotFoundExeption(messageExceptionAccountNotFound, descriptionExceptionAccountNotFound);
		
		return account.get();
	}

	@Override
	public void Debit(Long accountId, Double valueOfDebit) {
		Account account = this.find(accountId);
		account.debit(valueOfDebit);
		accountRepository.save(account);
		
 	}

}
