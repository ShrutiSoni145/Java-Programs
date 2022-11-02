import java.util.Scanner;
class swap{
public static void main(String[] args){
int a,b;     
Scanner s=new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
System.out.println("a="+a);
System.out.println("b="+b);

a=a+b;
b=a-b;
a=a-b;
System.out.println("a="+a);
System.out.println("b="+b);
}
}
