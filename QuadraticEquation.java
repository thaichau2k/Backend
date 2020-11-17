package Homework1911;
import java.lang.Math;

public class QuadraticEquation {
	private double a,b,c;
	public double getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public QuadraticEquation(double a, double b, double c) throws Exception {
		super();
		this.b=b;
		this.c=c;
		if(a!=0) this.a=a;
		else throw new ArithmeticException();
	};
	
	public void solve() throws Exception {
		double x= b*b-4*a*c;
		if(a==0) throw new ArithmeticException();
		else {
			if(x==0) System.out.println("Nghiem cua phuong trinh: "+b/(2*a));
			if(x>0) { 
				System.out.println("Nghiem thu nhat: "+(-b-Math.sqrt(x))/(2*a));
				System.out.println("Nghiem thu hai: "+(-b+Math.sqrt(x))/(2*a)); 
			}
			if(x<0) throw new Exception();
		}
	}
}

