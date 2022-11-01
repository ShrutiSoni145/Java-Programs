import java.util.Scanner;
class a{
public static void main(String[] args){
	int a[][]=new int[6][3];
	int d[]=new int[4];
	Scanner s=new Scanner(System.in);
	int i,j,k;
	int n,c,sum=0;
	c=0;
	n=3;
	k=0;
	for(i=0;i<6;i++){
		for(j=0;j<3;j++){
			a[i][j]=s.nextInt();
		}
	}
	for(i=0;i<6;i++){
		for(j=0;j<3;j++){
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	while(k<4){
		sum=0;
		for(i=k;i<n;i++){
				for(j=0;j<3;j++){
					if(i==k||i==k+2){
					sum=sum+a[i][j];
				    }else{
				    sum=sum+a[k+1][1];
					}
				}	
			}
			
		}
		d[c++]=sum;
		k++;
		n++;
	}
	for(int p=0;p<4;p++){
		System.out.println(d[p]);
	}
}

}
	