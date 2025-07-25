//Hardus Myburgh 40923894
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class SortTest 
{
	public static void main(String[] args) 
	{
		int[] data = new int[100000000];
		//Scanner input = new Scanner(System.in); 
		boolean sorted = true;
		int i=-1;
		int num;
		//long time0=System.currentTimeMillis();  
		
		try {
			
			File file = new File("20Mints.txt");
			Scanner input = new Scanner(file);
			long time0 = System.currentTimeMillis();
			
			while (input.hasNextInt()) {
				data[++i] = input.nextInt();
			}
		
			num = i++;
			long time1=System.currentTimeMillis();      
			System.out.println("Finished reading data, time to read data = "+(time1-time0)/1000.0+" seconds");
		
			bubbleSort(data, num);
		
			long time2=System.currentTimeMillis();
			System.out.println("\nFinished sorting data, time to sort data = "+(time2-time1)/1000.0+" seconds");
		
			for (i = 1; i < num && sorted; i++) {
				if (data[i] < data[i - 1])
					sorted = false;
			}
			if(sorted)
				System.out.println("Sorted");
			else
				System.out.println("Not sorted");
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
		}
	}
	
public static void bubbleSort(int[] arr, int n) {
	for (int i = 0; i < n -1; i ++) {
		for (int j = 0; j < n - i - 1; j++) {
			if (arr[j] > arr[j + 1]) {
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
	} 
}
}