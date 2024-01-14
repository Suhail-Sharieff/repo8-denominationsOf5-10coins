import java.util.Scanner;

/**
 * SuhailSharieff
 */
 class SuhailSharieff {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numner of test cases");
		int t=sc.nextInt();
		for (int v = 0; v < t; v++) {
			System.out.println("enter ther amount u have");
			int x=sc.nextInt();
			
			if(x%10==0){
				System.out.println("you need these many number of 10 rupee coins: "+x/10);
			}
			else{
				if((x%10)%5!=0||(x>5&&x<10)){
					System.out.println("impossible");

				}else{
					System.out.println("you need "+(x/10)+" ten rupee coins and "+((x%10)/5)+" five rupee coins");
				}
			}
		}
	}
}