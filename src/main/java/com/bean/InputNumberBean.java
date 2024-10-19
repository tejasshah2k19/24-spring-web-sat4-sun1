package com.bean;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class InputNumberBean {

	@NotNull(message = "Please Enter Number1")
	@Digits(integer = 5,fraction = 0,message = "Please Enter Valid Number")
	
	private Integer n1;//non primitive 
	
	@NotNull(message = "Please Enter Number2")
	private Integer n2;
	
	@NotBlank(message = "Please Select Operation")
	private String opr;

	public Integer getN1() {
		return n1;
	}

	public void setN1(Integer n1) {
		this.n1 = n1;
	}

	public Integer getN2() {
		return n2;
	}

	public void setN2(Integer n2) {
		this.n2 = n2;
	}

	public String getOpr() {
		return opr;
	}

	public void setOpr(String opr) {
		this.opr = opr;
	}

}
