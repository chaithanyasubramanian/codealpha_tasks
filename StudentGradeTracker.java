import java.util.Scanner;
public class StudentGradeTracker{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of Students:");
        int n=sc.nextInt();
        if(n<=0){
            System.out.println("Number of Students must be greater than zero");
            return;}
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.printf("Enter the mark of student %d:",i+1);
            a[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]>max)
                max=a[i];
        }
        for(int i=0;i<n;i++){
            if(a[i]<min)
                min=a[i];
            }
        double sum=0;
        for(int i=0;i<n;i++)
            sum+=a[i];
        double avg=sum/(double)n;
        System.out.println("-----Student Grade Report-----");
        System.out.println("Highest mark scored is: "+max);
        System.out.println("Lowest mark scored is: "+min);
        System.out.println("Average mark is: "+avg);
        sc.close();
    }
}