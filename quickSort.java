import java.util.Scanner;
class quickSort{
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
p.quickSort(a,0,9);     //if you want to call non-static method or access non-static var from outside the static method, then you have to create an object
  //for the class of that non-static method and variable.
}

}
class b{
int i;                 
void quickSort(int[] a,int lb,int ub){
	if(lb<ub){
		int loc=partition(a,lb,ub);
		quickSort(a,lb,loc-1);
		quickSort(a,loc+1,ub);
		for(i=0;i<10;i++){
	//System.out.print(s[i]); 	//only for string this type of statement will give leading and trailing space. space is not given in int type value.            
	    System.out.print(a[i]+" ");
    
        }
	}
}
int partition(int[] a,int lb,int ub){
	int p=a[lb];
	int start=lb;
	int end=ub;
	while(start<end){
		while(a[start]<=p){
			start++;
		}
		while(a[end]>p){
			end--;
		}
		if(start<end){
			int t=a[start];
			a[start]=a[end];
			a[end]=t;
		}
	}
	int t=a[lb];
	a[lb]=a[end];
	a[end]=t;
	return end;
}
/*void display(int[] s){
	s=sort(s);
	//for(i=0;i<20;i++){  // because of i<20 it will print value but not in proper manner as well as will give exception msg.
	for(i=0;i<10;i++){
	//System.out.print(s[i]); 	//only for string this type of statement will give leading and trailing space. space is not given in int type value.            
	System.out.print(s[i]+" ");
}

}*/
}