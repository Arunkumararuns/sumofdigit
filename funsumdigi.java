package javaclass2;
import java.util.*;

public class funsumdigi {
	public int sum(int a) {
		int temp=0;
		while(a!=0) {
			int b=a%10;
			temp=temp+b;
			a=a/10;
		}
		return temp;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		funsumdigi d=new funsumdigi();
		System.out.println(d.sum(n));
		

	}

}
