package com.jsp.String;
import java.util.Scanner;
public class FirstUpperRemainingLower {
	static String initCap(String str)
	{
		char ch[]=str.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ')
			{
				if(ch[i]>='a' && ch[i]<='z')
					ch[i]=(char)(ch[i]-32);
			}
			else if(ch[i]>='A' && ch[i]<='Z')
			{
				ch[i]=(char)(ch[i]+32);
			}
		}
		return new String(ch);
	
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Entre the String...");
		String str=sc.nextLine();
		str=initCap(str);
		System.out.println(str);
	}

}
