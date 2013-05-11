package main;
/*
 * File: Rational.java
 * -------------------
 * This file defines a simple class for representing rational numbers.
 * 
 * Ex6_10: Rewrite this implementation of Rational so that the private
 * instance variables num and den are declared as BigIntegers (from java.math)
 * instead of ints. Do not change argument or result type of any of the public
 * methods.
 */

import java.math.*;

/**
 * The Rational class is used to represent rational numbers, which
 * are defined to be the quotient of two integers.
 */
public class Rational {

/**
 * Creates a new Rational initialized to zero.
 */
	public Rational() {
		this(0);
	}

/**
 * Creates a new Rational from the integer argument.
 * @param n The initial value
 */
	public Rational(int n) {
		this(n, 1);
	}

/**
 * Creates a new Rational with the value x / y.
 * @param x The numerator of the rational number
 * @param y The denominator of the rational number
 */
	public Rational(int x, int y) {
		String xString = "" + x;
		String yString = "" + y;
		BigInteger xBig = new BigInteger(xString);
		BigInteger yBig = new BigInteger(yString);
		BigInteger gBig = xBig.gcd(yBig);
		num = xBig.divide(gBig);
		BigInteger yBigAbs = yBig.abs();
		den = yBigAbs.divide(gBig);
		if (y < 0) num = num.negate();
//		int g = gcd(Math.abs(x), Math.abs(y));
//		num = x / g;
//		den = Math.abs(y) / g;
//		if (y < 0) num = -num;
	}

/**
 * Adds the rational number r to this one and returns the sum.
 * @param r The rational number to be added
 * @return The sum of the current number and r
 */
	public Rational add(Rational r) {
			BigInteger thisNumTimesrDen = this.num.multiply(r.den);
			BigInteger thisDenTimesrNum = r.num.multiply(this.den);
			BigInteger sum = thisDenTimesrNum.add(thisNumTimesrDen);
			BigInteger denProduct = this.den.multiply(r.den);
			return new Rational(sum.intValue(), denProduct.intValue());
			
//			return new Rational(this.num * r.den + r.num * this.den,
//		                  	  	this.den * r.den);
	}

/**
 * Subtracts the rational number r from this one.
 * @param r The rational number to be subtracted
 * @return The result of subtracting r from the current number
 */
	public Rational subtract(Rational r) {
		BigInteger thisNumTimesrDen = this.num.multiply(r.den);
		BigInteger thisDenTimesrNum = r.num.multiply(this.den);
		BigInteger subtractSum = thisNumTimesrDen.subtract(thisDenTimesrNum);
		BigInteger denProduct = this.den.multiply(r.den);
		return new Rational(subtractSum.intValue(), denProduct.intValue());
		
//		return new Rational(this.num * r.den - r.num * this.den,
//		                    this.den * r.den);
	}

/**
 * Multiplies this number by the rational number r.
 * @param r The rational number used as a multiplier
 * @return The result of multiplying the current number by r
 */
	public Rational multiply(Rational r) {
		BigInteger denProduct = this.den.multiply(r.den);
		BigInteger numProduct = this.num.multiply(r.num);
		return new Rational(numProduct.intValue(), denProduct.intValue());
//		return new Rational(this.num * r.num, this.den * r.den);
	}

/**
 * Divides this number by the rational number r.
 * @param r The rational number used as a divisor
 * @return The result of dividing the current number by r
 */
	public Rational divide(Rational r) {
		BigInteger thisNumTimesrDen = this.num.multiply(r.den);
		BigInteger thisDenTimesrNum = r.num.multiply(this.den);
		return new Rational(thisNumTimesrDen.intValue(), thisDenTimesrNum.intValue());
//		return new Rational(this.num * r.den, this.den * r.num);
	}

/**
 * Creates a string representation of this rational number.
 * @return The string representation of this rational number
 */
	public String toString() {
		if (this.den.equals(den.ONE)) {
			return "" + num;
		} else {
			return num + "/" + den;
		}
//		if (den == 1) {
//			return "" + num;
//		} else {
//			return num + "/" + den;
//		}
	}

/**
 * Calculates the greatest common divisor using Euclid's algorithm.
 * @param x First integer
 * @param y Second integer
 * @return The greatest common divisor of x and y
 */
	private int gcd(int x, int y) {
		int r = x % y;
		while (r != 0) {
			x = y;
			y = r;
			r = x % y;
		}
		return y;
	}

/* Private instance variables */
	private BigInteger num;     /* The numerator of this Rational   */
	private BigInteger den;     /* The denominator of this Rational */

}
