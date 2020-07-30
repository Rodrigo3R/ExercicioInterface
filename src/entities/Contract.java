package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

	private Integer number;
	private Date date;
	private Double totalValue;
	
	List<Installment> installments = new ArrayList<Installment>();
	
	public Contract() {
	}

	public Contract(Integer number, Date data, Double tatalValue) {
		super();
		this.number = number;
		this.date = data;
		this.totalValue = tatalValue;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getData() {
		return date;
	}

	public void setData(Date data) {
		this.date = data;
	}

	public Double getTatalValue() {
		return totalValue;
	}

	public void setTatalValue(Double tatalValue) {
		this.totalValue = tatalValue;
	}

	public List<Installment> getInstallments() {
		return installments;
	}

	
}
