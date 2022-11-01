class bin{
public static void main(String[] args){
int b[]=new int[50];
int n=1234;
int j=0;
while(n!=1){
	b[j++]=n%2;
	n/=2;
	
}
b[j]=1;
int len=j+1;
int i=0;
while(i<(len/2))
{
	int temp=b[i];
	b[i]=b[j];
	b[j]=temp;
	i++;
	j--;
}
for(i=0;i<len;i++){
	System.out.print(b[i]);
}
int c=0;
int max=0;
i=0;
while(i<len){
	if(b[i]==1){
		c=0;
		j=i;
		while(b[j]!=0){
			c++;
			j++;
		}
		if(c>max){
			max=c;
		}
		i=j;
	}else{
		i++;
	}
}
System.out.println("max="+max);
}
}