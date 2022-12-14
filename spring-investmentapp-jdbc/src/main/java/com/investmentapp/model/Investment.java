package com.investmentapp.model;


public class Investment {
	
	private String planName;
	private Integer planId;
	private int entryAge;
	private String type;//mutual,ULIP,PPF,ED
	private double amount;
	private String purpose;//education, retirement,marriae
	private String risk; //high,low
	private String nominee;
	private int term;
	public Investment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Investment(String planName,  int entryAge, String type, double amount, String purpose,
			String risk, String nominee, int term) {
		super();
		this.planName = planName;
		
		this.entryAge = entryAge;
		this.type = type;
		this.amount = amount;
		this.purpose = purpose;
		this.risk = risk;
		this.nominee = nominee;
		this.term = term;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public Integer getPlanId() {
		return planId;
	}
	public void setPlanId(Integer planId) {
		this.planId = planId;
	}
	public int getEntryAge() {
		return entryAge;
	}
	public void setEntryAge(int entryAge) {
		this.entryAge = entryAge;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getRisk() {
		return risk;
	}
	public void setRisk(String risk) {
		this.risk = risk;
	}
	public String getNominee() {
		return nominee;
	}
	public void setNominee(String nominee) {
		this.nominee = nominee;
	}
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		this.term = term;
	}
	@Override
	public String toString() {
		return "Investment [planName=" + planName + ", planId=" + planId + ", entryAge=" + entryAge + ", type=" + type
				+ ", amount=" + amount + ", purpose=" + purpose + ", risk=" + risk + ", nominee=" + nominee + ", term="
				+ term + "]";
	}
	
	

}
