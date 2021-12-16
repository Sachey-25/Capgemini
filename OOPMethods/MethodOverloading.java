package OOPMethods;

class MethodOverloading {
	//Method:1 name is disp || parameter is different
		public void disp(char c) {
			System.out.println(c);
		}
		//Method:2 name is disp || parameter is different
		public void disp(char c, int i){
			System.out.println(c + " " + i);
		}
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.disp('S');
		obj.disp('S',10);
	}
}