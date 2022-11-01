import java.util.*;
import java.io.*;
class reverse{
public static void main(String[] a){
String s;
System.out.println("Enter string to reverse");
Scanner p=new Scanner(System.in);
s=p.nextLine();
rr r=new rr();
r.display(s);
String t=r.rev(s);

r.display(t);
}
}
class rr{
char temp;
int i;
int j;

void display(String s){
System.out.println(s);
}
String rev(String s){
char t[]=new char[s.length()];
for(i=0;i<s.length();i++){
	t[i]=s.charAt(i);
}
i=0;
j=(s.length())-1;
while(i<(s.length())/2){
temp=t[i];
t[i]=t[j];
t[j]=temp;
i++;
j--;
}
//System.out.println(Arrays.toString(t));//represent string as list of array's element.
s=String.valueOf(t);
return s
}

}