import java.util.Scanner;
class Merge{
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
void mergeSort(int[] a,int lb,int ub){
	if(lb<ub){
		int mid=(lb+ub)/2;
		mergeSort(a,lb,mid);
		mergeSort(a,mid+1,ub);
		mergeSort(a,lb,mid,ub);
	}
}
void merge(int[] a,int lb,int mid, int ub){
	int[] b=new int[a.length()];
	int i=lb;
	int j=mid+1;
	int k=ub;
	while(i<=mid&&j<=ub){
		if(a[i]<=a[j]){
			b[k]=a[i];
			i++;
		}else{
			b[k]=a[j];
			j++;
	}}
	if(i>mid){
		while(j<=ub){
			b[k]=a[j];
			j++;
			k++;
		}
	}else{
		while(i<=mid){
			b[k]=a[i];
			i++;
			k++;
		}
	}
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