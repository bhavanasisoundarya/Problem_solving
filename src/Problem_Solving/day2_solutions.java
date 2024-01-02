package Problem_Solving;

public class day2_solutions {
	public static void main(String[] args) {
		// question one //
//		int n = 4;
//		for(int i=n; i>=1; i--) {
//			for(int j=i; j>=1; j--) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		// question two
//		 int N = 5;
//		 for (int i = 0; i < N; i++) {
//	           
//	            for (int j = 0; j < i; j++) {
//	                System.out.print(" ");
//	            }
//
//	           
//	            for (int k = 0; k < N - i; k++) {
//	                System.out.print("* ");
//	            }
//
//	            
//	            System.out.println();
//	        }
//		// question three//
		
		int n = 5;
        boolean s = true;

        if (n <= 1) {
            s = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    s = false;
                    break;
                }
            }
        }

        if (s) {
            System.out.println("It is a prime number");
        } else {
            System.out.println("It is not a prime number");
        }
	}

}
