/*
 * Name : Anuj Goski
 * Date : 2/15/20
 * Course Number: 355
 * Section: 
 * */
public class FractionalNumber {

	/* Instance Variables */
	private int numerator;
	private int denominator;

	/* No Arg Constructor */
	public FractionalNumber() {
		super();
	}

	/* Two Arg Constructor */
	public FractionalNumber(int numerator, int denominator) {
		super();
		setNumerator(numerator);
		setDenominator(denominator);
		normalize();
	}

	/* Getter/Setter for the instance variable */
	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;

	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		if (denominator == 0) {
			throw new RuntimeException("Denominator cannot be 0");
		}
		this.denominator = denominator;
	}

	/* This method performs the addition of two fractional number Instance */
	public void add(FractionalNumber fn) {
		// a/b + c/d = (a*d + b*c) / b*d
		int a = (this.getNumerator() * fn.getDenominator()) + (this.getDenominator() * fn.getNumerator());
		int b = this.getDenominator() * fn.getDenominator();
		setNumerator(a);
		setDenominator(b);
	}

	/* This method performs the subtraction of two fractional number Instance */
	public void subtract(FractionalNumber fn) {
		// a/b – c/d = (a*d – b*c) / b*d
		int a = (this.getNumerator() * fn.getDenominator()) - (this.getDenominator() * fn.getNumerator());
		int b = this.getDenominator() * fn.getDenominator();
		setNumerator(a);
		setDenominator(b);
	}

	/* This method performs the multiplication of two fractional number Instance */
	public void multiply(FractionalNumber fn) {
		// a/b * c/d = a*c / d*b
		int a = this.getNumerator() * fn.getNumerator();
		int b = this.getDenominator() * fn.getDenominator();
		setNumerator(a);
		setDenominator(b);
	}

	/* This method performs the division of two fractional number Instance */
	public void divide(FractionalNumber fn) {
		// (a/b) / (c/d) = a*d / b*c, where c/d != 0
		if (fn.getNumerator() == 0) {
			throw new RuntimeException("Division cannot be done as denominator got calcualted as 0");
		}
		int a = this.getNumerator() * fn.getDenominator();
		int b = this.getDenominator() * fn.getNumerator();
		setNumerator(a);
		setDenominator(b);
	}

	/* This normalized the fractional number instance */
	private void normalize() {
		if (denominator < 0) {
			denominator = Math.abs(denominator);
			numerator = numerator * (-1);
		}
	}

	/* Overridden toString method */
	@Override
	public String toString() {
		return numerator + "/" + denominator;
	}

	/* Overridden equals method */
	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof FractionalNumber) {
			FractionalNumber fn = (FractionalNumber) obj;
			if ((this.getNumerator() * fn.getDenominator()) == (fn.getNumerator() * this.getDenominator())) {
				return true;
			}
		}
		return false;
	}

}
