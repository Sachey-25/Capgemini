package SwitchStatement;
import java.util.Scanner;

public class CheckVowels {

	public static void main(String[] args) {
		//a A, e E, i I, o O, u U ----> True 
		boolean isVowel=false;
		Scanner sachin=new Scanner(System.in);
		System.out.println("Enter a Alphabet");
		char ch=sachin.next().charAt(0);//Input aAeEiIoOuU
		sachin.close();
		
		switch(ch){//ch is an input from sachin
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U': isVowel = true;
		}
			if(isVowel == true ) {
				System.out.println(ch + ": is a Vowel");
			}
			else if((ch>'a'&& ch<='z')||(ch>='A' && ch<='Z'))
				System.out.println(ch + ": is a consonant");
			else
				System.out.println("Input is not an alphabet");
		}
}
