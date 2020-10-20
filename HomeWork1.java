import java.util.Scanner;

public class HomeWork1 {
	public static int factorial(int n) {
		if(n==1 || n==0) return 1;
		else return n*factorial(n-1);
	}
	
	public static double eNumber(int n) {
		if(n==0) return 1;
		else return eNumber(n-1) + 1.0/(factorial(n));
	}

	public static double ePower( int x) {
		int n=10;
		double pow =1;
		int i=1;
		while(i <= n) {
			pow += (Math.pow(x, i))/factorial(i);
			i++;
		}
		return pow;	
	}
	
	private static String enCode(int n) {
		int thousandsOf, hundredsOf, tensOf, units;
		thousandsOf = (n/1000+7)%10;
		hundredsOf = ((n/100)%10+7)%10;
		tensOf = ((n/10)%10+7)%10;
		units = (n%10+7)%10;
		return Integer.toString(tensOf) + Integer.toString(units) + Integer.toString(thousandsOf) + Integer.toString(hundredsOf);
	}
	
	private static String deCode(int n) {
		int thousandsOf, hundredsOf, tensOf, units;
		thousandsOf = ((n/1000)+3)%10;
		hundredsOf = ((n/100)%10+3)%10;
		tensOf = ((n/10)%10+3)%10;
		units = (n%10+3)%10;
		return Integer.toString(tensOf) + Integer.toString(units) + Integer.toString(thousandsOf) + Integer.toString(hundredsOf);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap so nguyen n: ");	
		int n = input.nextInt();
		System.out.print("Nhap so nguyen x: ");
		int x = input.nextInt();
		System.out.println("1.1, Giai thua cua "+n+": "+factorial(n));
		System.out.println("1.2, Gia tri cua e voi do chinh xac "+n+" la:"+eNumber(n));
		System.out.println("1.3, Gia tri cua e^"+x+" la:"+ePower(x));
		System.out.println("------------------------------------------");
		
		System.out.print("2.1, Nhap so nguyen co 4 chu so: ");
		int encode = input.nextInt();
		while(encode<1000 || encode >9999) {
			System.out.print("so da nhap khong hop le!!! Hay nhap lai: ");
			encode = input.nextInt();
		}
		System.out.println("So ma hoa cua "+encode+" la: " +enCode(encode));
		System.out.print("2.2, Nhap ma so co 4 chu so: ");
		int decode = input.nextInt();
		while(decode<1000 || decode >9999) {
			System.out.print("so da nhap khong hop le!!! Hay nhap lai: ");
			decode = input.nextInt();
		}
		System.out.print("Giai ma so "+decode+" ta duoc: " +deCode(decode));
	}

}
