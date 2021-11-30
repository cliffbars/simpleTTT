import java.util.Scanner; 

public class forLoopUser  { 

	public static void main(String[] args) 
	{
  
       	int numAdd = 0; 
		Scanner in = new Scanner(System.in);
		System.out.println("Enter num: ");
		// int times = in.nextInt(); 

		for(int i = 0; i < 5; i++) {
            int times = in.nextInt();
            numAdd = times + numAdd;
            System.out.println(numAdd); 
            
		}
	}

}
