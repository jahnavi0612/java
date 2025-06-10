//work shop on ticket booking (poly)
import java.util.*;
class booking{
    void bookticket(){
        System.out.println("Booking a general ticket-any mode");
    }
}
//train Booking
class trainbooking extends booking{
    void bookticket(){
        System.out.println("Train Ticket Booked Successfully.....");
        System.out.println("Seat: L8|Coach: B2|Cost: 1000/-");

    }
}
//flight booking
class flightbooking extends booking{
    void bookticket(){
        System.out.println("Flight Ticket Booked Successfully...");
        System.out.println("Seat: 16A | Service :Indigo |Fare : 6000/-");
    }
} 
//cab booking
class cabbooking extends booking{
    void bookticket(){
        System.out.println("Cab Ticket Booked Successfully...");
        System.out.println("Vehicle:pujitha | Driver : kanula|Estimated Fare : 400/-");
    }
}
//cruise booking
class cruisebooking extends booking{
    void bookticket(){
        System.out.println("Cruise sail Booked Successfully...");
        System.out.println("Cabin: Front View | Deck :3 |Fare : 11400/-");
    }
}
class busbooking extends booking{
    void bookticket(){
        System.out.println("Bus seat Booked Successfully...");
        System.out.println("Seat: 21w | Deck :Orange Travels |Number : 2323/-");
    }
}
public class tick{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        booking booking ;
        System.out.println("Enter your mode of travel: ");
        System.out.println("1.Train");
        System.out.println("2. Bus");
        System.out.println("3. Flight");
        System.out.println("4. Cab");
        System.out.println("5. Cruise");
        System.out.println("Enter your choice: ");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                booking=new trainbooking();
                break;
            case 2:
                booking=new busbooking();
                break;
            case 3:
                booking=new flightbooking();
                break;
            case 4:
                booking=new cabbooking();
                break;
            case 5:
                booking=new busbooking();
                break;
            default:
                booking=new booking();
        }
        System.out.println("\n Processing your booking...........");
        booking.bookticket();
    }
}