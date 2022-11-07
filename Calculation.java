// polymorphism concept// 

package calc;

public class Calculation {
	public void add(int a) {
		a++;
		System.out.println(a);
	}
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void add(char ch) {
		System.out.println((int)ch);
	}
public void add(float x,float y) {
	System.out.println(x+y);
}
public static void main(String[]args) {
	Calculation cal=new Calculation();
	cal.add('a');
	cal.add(9);
	cal.add(2,3);
	cal.add(9.4f,9.2f);
}
}
