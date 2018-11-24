package day03;

public class Test {

	public static void main(String[] args) {
		/**
		 * 
		 * 标注一个开始时间。  33毫秒。
		 */
		long startTime = System.currentTimeMillis();
		long sum = 0;
		for(long i=1;i<=10000000000L;i++){
			sum+=i;
		}
		System.out.println(sum);
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		
		
		
		
		
		
		
		long startTime2 = System.currentTimeMillis();
		long sum2 = 0;
		long n = 10000000000L;
		//高斯求和 。 >> 
		sum2=(1+n)*n>>1;
		System.out.println(sum2);
		long endTime2 = System.currentTimeMillis();
		System.out.println(endTime2-startTime2);
	}

}
