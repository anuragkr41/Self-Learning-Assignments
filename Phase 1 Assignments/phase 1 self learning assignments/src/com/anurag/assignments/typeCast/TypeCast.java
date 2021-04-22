package com.anurag.assignments.typeCast;

public class TypeCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int integerValue=10;
		byte byteValue = (byte)integerValue; //Explicit Cast
		
		
//		Implicit cast
		
		long longValue=2343L;
		double doubleValue = longValue;
		
		System.out.println("The valute of integer is "+integerValue);
		System.out.println("The value of byte is "+byteValue);
		
		
		System.out.println("The value of long is "+longValue);
		System.out.println("The value of double is " + doubleValue);

	}

}
