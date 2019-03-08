
public class MySpecialArrayUtils {
	public static void reverse (int[] arr) {
		int n = arr.length;
		int temp =0;
		int k=n/2;
		for(int i=0;i<k;i++) {
			temp=arr[n-i-1];
			arr[n-i-1]=arr[i];
			arr[i]=temp;
		}
	}
	public static int[] sumEvenOdd(int[] arr) {
		 int[] arr1 = new int[]{0,0}; 
         int n =arr.length ;
         for(int i=0;i<n;i++) {
        	 if(arr[i]%2==0) {
        		 arr1[0]=arr1[0]+arr[i];
        	 }
        	 else {
        		 arr1[1]=arr1[1]+arr[i];
        	 }
         }
		return arr1;
	}

	public static double average(int[] arr) {
		int n = arr.length ;
		double sum =0;
		for(int i=0;i<n;i++) {
			sum=sum+(double)arr[i]/n;
		}
		return sum ;
	}
	public static void moveValue(int[] arr, int val) {
		int n = arr.length;
		int count=0;
		int i =0;
		
		while(count<n) {
			if(i>n-1) {
				arr[count]=val;
				count++;
			}
			else if(arr[i]!=val) {
				arr[count]=arr[i];
				count++;
			}
			i++;
		}
	
	}
	public static int[][] transpose(int[][] arr) {
		int row = arr.length;
		int col = arr[0].length;
		int [][] trans = new int[col][row];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				trans[j][i]=arr[i][j];
			}
		}
		return trans;
		}
	public static long fib(int n) {
		long f1 = 0, f2 = 1, f3;
	    for (int i=1;i<=n-1;i++) {
	        f3 =f1+f2;
	        f1=f2;
	        f2=f3;
	    }
	    return f1 ;
	}
}

