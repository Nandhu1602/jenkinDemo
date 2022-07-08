import java.util.*;

class Claculator{
	public int add(int num1, int num2){
		return num1+num2;
	}
	public int sub(int num1, int num2){
		return num1-num2;
	}
	public int mul(int num1, int num2){
		return num1*num2;
	}
	public int div(int num1, int num2){
		if(num2!=0)
			return num1/num2;
	}
	
	public static void main(String args[]){
		add(50,20);
		sub(50,20);
		mul(30,20);
		div(20,10);
	}
}