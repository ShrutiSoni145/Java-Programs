import java.util.Scanner;
class Bubble{
	static int i;       //var should be static for using inside the static method. 
public static void main(String[] args){
//int a[20];     //this declaration will give error: ] is expected. java array's declaration is always dynamatically.
int[] a=new int[10];
Scanner s=new Scanner(System.in);
for(i=0;i<10;i++){
	a[i]=s.nextInt();
}

//display(a);              //for calling from the static method the calling method should be static.
b p=new b();
p.display(a);              //if you want to call non-static method or access non-static var from outside the static method, then you have to create an object
                           //for the class of that non-static method and variable.
}

}
class b{
int i;                 
int[] sort(int[] a){
	int j=1;
		while(j<10){          // time complexity= best=O(n) worst= O(n^2).
			for(i=0;i<9-j;i++){
				if(a[i]>a[i+1]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			j++;
		}
    return a;
}
void display(int[] s){
	s=sort(s);
	//for(i=0;i<20;i++){  // because of i<20 it will print value but not in proper manner as well as will give exception msg.
	for(i=0;i<10;i++){
	//System.out.print(s[i]); 	//only for string this type of statement will give leading and trailing space. space is not given in int type value.            
	System.out.print(s[i]+" ");
}

}
}