package com.testing.isbntools;

import java.io.DataOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;

public class LoanApplication 
{

	private int id;
	private String name;
	private int principal; // amount borrowed
	private int termInMonths;
	private BigDecimal repayment;
	private Boolean approved;
	
	
	public Boolean getApproved() {
		return approved;
	}

	public void setApproved(Boolean approved) {
		this.approved = approved;
	}

	public BigDecimal getInterestRate() {
		try {
			URL url = new URL("http://loans.virtualpairprogrammers.com/getInterestRate");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setConnectTimeout(5000);
			connection.setReadTimeout(5000);
			connection.setRequestProperty("Content-Type", "application/json");
			DataOutputStream out = new DataOutputStream(connection.getOutputStream());
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new BigDecimal(10);
	}



	public BigDecimal getRepayment() {
		return repayment;
	}

	public void setRepayment(BigDecimal repayment) {
		this.repayment = repayment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrincipal() {
		return principal;
	}

	public void setPrincipal(int principal) {
		this.principal = principal;
	}

	public int getTermInMonths() {
		return termInMonths;
	}

	public void setTermInMonths(int termInMonths) {
		this.termInMonths = termInMonths;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
