package Logical;

public class AmstrongNumber { 
	//An Armstrong number is a number that is equal to the sum of its own 
	//digits each raised to the power of the number of digits
	//example consider 153-->count of digit=3,(1^3)+(5^3)+(3^3)=153
	
	public static void main(String[] args) {
		int num=15,copy=num,count=0,rem=0,res=0;
		count=countNumber(num);
		for (int i =1; i <= count; i++) {
			rem=num%10;
			res+=AmstrongNumber(rem, count);
			num=num/10;
		}
		System.out.println(copy==res?"Amstrong":"not Amstrong");
		
	}
	public static int AmstrongNumber(int num,int count) {
		int res=1;
		for (int i =1; i <=count; i++) {
			res*=+num;
		}
		return res;
	}
	
	public static int countNumber(int num) {
		int count=0,res=0;
		while (num!=0) {
			res=num%10;
			count++;
			num=num/10;
		}
		return count;
	}

}
