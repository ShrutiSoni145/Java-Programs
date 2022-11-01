class TooYoung extends Exception{
	TooYoung(String str){
		super(str);
	}
}
class test{
	public static void main(String[] args)//throws TooYoung    //jvm ke paas re
	{
		int age=Integer.parseInt(args[0]);
		try{
		if(age<18){
			
				
			throw new TooYoung("Too Young");
			}
			System.out.println("Thanks for registeration");
		}
			catch(TooYoung e){
				System.out.println(e.toString());
			}
	}
}