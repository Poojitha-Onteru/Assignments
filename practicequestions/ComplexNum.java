package com.practicequestions;

import java.util.Objects;

public class ComplexNum {
	 int real;
	 int imag;
	
	
		
	public ComplexNum() {
		super();
	}

	public ComplexNum(int real, int imag) {
		super();
		this.real = real;
		this.imag = imag;
	}
	
	public int getReal() {
		return real;
	}
	public void setReal(int real) {
		this.real = real;
	}
	public int getImag() {
		return imag;
	}
	public void setImag(int imag) {
		this.imag = imag;
	}

	@Override
	public String toString() {
		return "ComplexNum [real=" + real + ", imag=" + imag + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(imag, real);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ComplexNum other = (ComplexNum) obj;
		return imag == other.imag && real == other.real;
	}
	
	

}
