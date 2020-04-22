//Fastest Way to find Prime number]
//In this we reduce the complexity of finding the prime number O(n^2) to (nloglog(n))
import java.util.*;
public class PrimeSeive{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n+1];
		Arrays.fill(a,0);
		prime(a,n);
	}
	/*
		first loop takes O(n/2)
		O(n((1/2)+(1/3)+(1/4).....))
		O(nlog(n)log(n))
	*/
	public static void prime(int a[],int n){ 
		//first marks all the odd number as prime
		for (int i=3;i<=n;i=i+2){
			a[i]=1;
		}
		//Seive
		for (int i=3;i<=n;i+=2){
			
			if(a[i]==1){
				//marks all the multiples of i as not prime
				for (int j=i*i;j<=n;j=j+i){
					a[j]=0;
				}
			}
		}
		//marks 2 as prime
		a[2]=1;
		System.out.println('2');
		for(int i=3;i<=n;i+=2){
			//System.out.println("  "+i);
			if(a[i]==1){
				System.out.println(i);
			}
		}
	}
}