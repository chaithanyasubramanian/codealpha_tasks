import java.util.Scanner;
public class HotelReservationSystem{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n,ch;
    boolean rooms[]=new boolean[5];
    do{
        System.out.println("====HOTEL RESERVATION SYSTEM====");
        System.out.println("1.View Available Rooms");
        System.out.println("2.Book Room");
        System.out.println("3.Cancel Reservation");
        System.out.println("4.View Bookings");
        System.out.println("5.Exit");
        System.out.print("Enter Your Choice:");
        ch=sc.nextInt();
        switch(ch){
            case 1:
                System.out.println("View Available Rooms Selected");
                System.out.println("Available rooms");
                for(int i=0;i<5;i++){
                    if(rooms[i]==true)
                        System.out.println("Room "+(i+1)+" - Booked");
                    else
                        System.out.println("Room "+(i+1)+" - Available");
                }
                break;
            case 2:
                System.out.println("Book Rooms Selected");
                System.out.print("Enter Room Number(1-5): ");
                n=sc.nextInt();
                if(n<1||n>5){
                    System.out.println("Invalid Room Number");
                    break;
                }
                if(rooms[n-1]==false){
                    System.out.println("Room "+n+" has been booked Successfully");
                    rooms[n-1]=true;
                    break;
                }
                else
                    System.out.println("Room is already booked");
                
                break;
            case 3:
                System.out.print("Enter room number(1-5):");
                n=sc.nextInt();
                if(n<1||n>5){
                    System.out.println("Invalid Room number");
                    break;
                }
                if(rooms[n-1]==true){
                System.out.println("Reservation for Room "+n+" has been cancelled Successfully");
                rooms[n-1]=false;
                }
                else
                    System.out.println("Room is already available");
                break;
            case 4:
                System.out.println("View Bookings Selected");
                int b=0;
                System.out.println("----- Booked Rooms -----");
                for(int i=0;i<5;i++){
                if(rooms[i]==true){
                    b++;
                    System.out.println("Room "+(i+1));
                }
                }
                if (b==0)
                    System.out.println("No rooms are currently booked.");
                break;
            case 5:
                System.out.println("ThankYou");
                break;
            default:
                System.out.println("Invalid Choice");
        }
}while(ch!=5);
sc.close();
}}