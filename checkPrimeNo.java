import java.util.Scanner;
class swap{
public static void main(String[] args){
int a,c=0;     //this line will not give me error despite a and b are local variables. after declaring them we are assigning them the values.
Scanner s=new Scanner(System.in);
a=s.nextInt();
if(a==0||a==1){
	System.out.println("a is not prime");
}
if(a==2){
	System.out.println("a is prime");
}
for(int i=2;i<=(a/2);i++){
if(a%i==0){
c++;
break;
}}
if(c==0){
System.out.println("a is prime");
}
else{

System.out.println("a is not prime");

}
}
}