
public class Submultiple {
	
	public static void main(String[] args) {
		int num1 = 15;
		int num2 = 20;
		
		int i=0;
		
		int gcd=0;
		int l =0;
		
		for ( i =1 ; i<=num1 ; i++)
		{
			if(((num2%i)==0)&&((num1%i)==0))	{
				gcd = i;
			}
		}
		
		for (i = 1; i <100000 ; i++) {
			if ((i%15 == 0)&&(i%20 ==0)) {
			    l = i ;
				break;
			}
		}

	    System.out.println(gcd); //�ִ� �����
		System.out.println(l);// �ּ� �����
		System.out.println((15*20)/gcd);// �ּ� �����	
		
		/*
		for (int i = 1; i <= num1; i++) {
			if ((num1 % i) == 0) {
				cnt++;
				System.out.print(i + "\t");
			}
		}
		
		 * if (cnt ==2) System.out.println("�Ҽ��Դϴ�."); else
		 * System.out.println("�Ҽ��� �ƴմϴ�.");
		 */

	}

}
