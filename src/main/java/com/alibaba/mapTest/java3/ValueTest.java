package com.alibaba.mapTest.java3;

public class ValueTest {
	int id;

	public ValueTest(int id) {
		super();
		this.id = id;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ValueTest other = (ValueTest) obj;
		if (id != other.id)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "[" + id + "]";
	}
}
