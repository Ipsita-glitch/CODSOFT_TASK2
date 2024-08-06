import java.util.Scanner;
class Student_Grade
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The Five Subject Marks :");
		int j1 = input.nextInt();
		int j2 = input.nextInt();
		int j3 = input.nextInt();
		int j4 = input.nextInt();
		int j5 = input.nextInt();
		int total = j1+j2+j3+j4+j5;
		float percentage = total/5;
		System.out.println("Total :"+total);
		System.out.println("Percentage :"+percentage);	
		if(percentage>=90)
			System.out.println("Grade A");
		else if(percentage>=80)
			System.out.println("Grade B");
		else if(percentage>=70)
			System.out.println("Grade C");
		else if(percentage>=60)
			System.out.println("Grade D");
		else if(percentage>=40)
			System.out.println("Grade E");
		else
			System.out.println("Grade F");
	}
}
