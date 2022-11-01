import java.util.*;
//import java.io.*;
class reverse{
public static void main(String[] a){
String s;
System.out.println("Enter string to reverse");
Scanner p=new Scanner(System.in);
s=p.nextLine();
rr r=new rr();
r.display(s);
boolean b = r.checkVowel(s);
System.out.println(b);
}
}
class rr{
char temp;
int i;    //i defaultly initialized by zero.
int j;

void display(String s){
System.out.println(s);
}
boolean checkVowel(String s){
//char t[]=new char[s.length()];
/*for(;i<s.length();i++){
t[i]=s.charAt(i);
}*/
char[] t=s.toCharArray();

for(i=0;i<s.length();i++){
//if(t[i]=='a'||'e'||'i'||'o'||'u')//error= bad operand type for binary operator;
if(t[i]=='a'||t[i]=='e'||t[i]=='i'||t[i]=='o'||t[i]=='u'){
//return true;  can't return from the for loop
i++;
break;
}else if(t[i]=='A'||t[i]=='E'||t[i]=='I'||t[i]=='O'||t[i]=='U'){
i++;
break;
}
}
if(i==0){
	return false;
}else{
	return true;
}
}
}