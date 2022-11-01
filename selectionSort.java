import java.util.Scanner;
class selection{
public static void main(String[] args){
//int a[20];     //this declaration will give error: ] is expected.
int[] a=new int[20];
int i;
Scanner s=new Scanner(System.in);
for(i=0;i<20;i++){
	a[i]=s.nextInt();
}
for(i=0;i<20;i++){
	for(int j=i+1;j<20;j++){
		if(a[j]<a[i]){
			int temp=a[j];
			a[j]=a[i];                                //time complexity= o(n^2) both best and wrost; here n=20;
			a[i]=temp;
		}
	}
}
for(i=0;i<20;i++){
	System.out.print(a[i]+" ");                
}
}
}
