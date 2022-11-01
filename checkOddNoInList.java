import java.util.*;
class fab{    
boolean check(List<Integer> l){
for(int i:l){
	if(i%2!=0){
		return true;
	}
}
return false;
}
public static void main(String[] a){
List<Integer> arr = new ArrayList<Integer>(4);

Scanner s=new Scanner(System.in);
for(int i=1;i<=4;i++){
	arr.add(s.nextInt());
}

fab f=new fab();
System.out.println(f.check(arr));
}
}
