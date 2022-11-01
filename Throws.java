class in extends Exception{
int x;
in(int a){
x=a;
}
public String toString(){
return "insufficient "+x;
}
}
class Account{
int bal;
Account(){
bal=500;
}
void withdraw(int amt)//throws in
{
if(bal-amt<500){         

throw new in(amt);
 
}
bal-=amt;
}
}
class demo //extends in{
{
public static void main(String[] args)extends in{
	//here exception class ko extend kro us class me us class me jaha try and catch hai ya throws keyword ka use kro. 
Account a=new Account();

try{
a.withdraw(300);
}
catch(in e){
System.out.println(e);
}
}
}
