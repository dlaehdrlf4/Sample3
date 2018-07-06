package sample;

public class Sample {

	public static void main(String[] args) {
		
		int [] ar = {10,20,70,40,15};
		int rank = 1;
		int temp = 0;
		for(int i=0;i<5;i=i+1) {
			for (int j=0;j<5;j=j+1) {
				if(ar[i] > ar[j]) {
					temp = ar[j];
					ar[j] = ar[i];
					ar[i] = temp;
				}
				
			}
		}
		for(int i = 4 ; i>=0; i--) {
			System.out.print("\t" + ar[i]);
		}

	}

}
