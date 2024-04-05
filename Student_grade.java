import java.util.Scanner;
class Student_grade 
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println("\t\t Student Grade finder");
        System.out.println("Enter the no.of.subjects");
		int no_of_subjects=sc.nextInt();
		int sum=0;
		double avg_percntge;
		for (int i=1;i<=no_of_subjects ;i++ )
		{
			System.out.println("enter the subject "+i+" marks");
			int subject=sc.nextInt(); 
		    if(no_of_subjects>0)
		    {
		     sum=sum+subject;
		    }
		}
	    avg_percntge=sum/no_of_subjects;
		String Grade=(avg_percntge>90.0)?"A":(avg_percntge>70.0)? "B" :(avg_percntge>50.0)? "C":"D";
		Thread.sleep(1000);
		System.out.println("The Total_Marks gained by the student:"+sum);
		Thread.sleep(1000);
		System.out.println("Average_percentage:"+avg_percntge);
		Thread.sleep(2000);
		System.out.println("Student_grade:"+Grade);
		}
} 
