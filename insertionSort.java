import java.util.Scanner;
class insertion{
	static int i;       //var should be static for using inside the static method. 
public static void main(String[] args){
//int a[20];     //this declaration will give error: ] is expected. java array's declaration is always dynamatically.
int[] a=new int[10];
Scanner s=new Scanner(System.in);
for(i=0;i<10;i++){
	a[i]=s.nextInt();
}

//display(a);              //for calling from the static method the calling method should be static.
insertion p=new insertion();
p.display(a);              //if you want to call non-static method or access non-static var from outside the static method, then you have to create an object
                           //for the class of that non-static method and variable.
}
int[] sort(int[] s){
	int j;
	int c;
	for(i=1;i<10;i++){
		c=s[i];
		j=i-1;
		while(s[j]>c&&j>=0){          // time complexity= best=O(n) worst= O(n^2)->all the element are in decending order.
			s[j+1]=s[j];
			j--;
		}
		s[j+1]=c;
	}
return s;
}
void display(int[] s){
	int[] r=sort(s);
	//for(i=0;i<20;i++){  // because of i<20 it will print value but not in proper manner as well as will give exception msg.
	for(i=0;i<10;i++){
	System.out.print(r[i]+" ");                
}
}
}

