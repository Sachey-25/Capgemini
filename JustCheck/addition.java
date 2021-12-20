package JustCheck;

import AccessModifiers.Protected;

public class addition  extends Protected{
	
	public static void main(String[] args) {
		addition object = new addition();
		System.out.println(object.addtwonumbers(23,24));
	}
}


/*---------------+--------------+---------------+---------------------
ACCESS 			 |	CLASS		|Package		|Subclass	|Others   |
	SPECIFIERS	 |				|				|			|		  |
_________________+______________+_______________+___________+_________|
public			 | Yes			|Yes			|Yes		|Yes	  |
_________________+______________+_______________+___________+_________|
protected		 | Yes			|Yes			|Yes		|No		  |
_________________+______________+_______________+___________+_________|
default			 | Yes			|Yes			|Yes		|No		  |
_________________+______________+_______________+___________+_________|
private			 | Yes			| NO			|No			|No		  |
_________________+______________+_______________+___________+_________|
*/