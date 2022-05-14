package br.com.lab.impacta.account.domain.exception;

public class AccountNotFoundExeption extends RuntimeException {

	  private String description;

	    public String getDescription() {
	        return description;
	    }

	    public AccountNotFoundExeption(){super();}

	    public AccountNotFoundExeption(String message, String description) {
	        super(message);

	        this.description = description;
	    }
	    
	    
}
