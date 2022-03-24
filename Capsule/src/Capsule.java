import java.util.Scanner;
public class Capsule
{
    public static Scanner sc=new Scanner(System.in);
    public static boolean capsule1[];
    public static String guests[];
    public static int Capsule;
    public static int numGuests=0;
    public static int menu()
    {
        System.out.println("Guest menu");
        System.out.println("===================");
        System.out.println("1. Check in");
        System.out.println("2. Check out");
        System.out.println("3. View Guests");
        System.out.println("4. Exit");
        System.out.println("Choose an option [1-4]:");
        int Userchoice = Integer.parseInt(sc.nextLine());
        return Userchoice;
    }
    public static void main(String[] args)
    {

        System.out.println("Welcome to Red Capsule!");
        System.out.println("===========================");
        System.out.print("Enter the number of capsules available: ");
        Capsule=Integer.parseInt(sc.nextLine());
        capsule1=new boolean[Capsule];
        guests=new String[Capsule];
        boolean run=true;
        //Loop
        while(run)
        {
            int menuchoice=menu();
            switch(menuchoice)
            {
                case 1:Checkin();break;
                case 2:CheckOut();break;
                case 3:ViewGuest();break;
                case 4:
                    System.out.println("Exit");
                    System.out.println("====");
                    System.out.println("Are you sure you want to exit?");
                    String input=sc.nextLine();
                    if(input.equalsIgnoreCase("YES"))
                    {
                        run=false;
                    }
                    break;
            }
        }
        System.out.println("Bye");
    }
    public static void Checkin()
    {
        System.out.println("Guest Check In");
        System.out.println("==============");
        System.out.print("Guest Name:");
        String guestName= sc.nextLine();
        System.out.print("Capsule #[1-"+Capsule+"]: ");
        int capsuleNumber= Integer.parseInt(sc.nextLine());
        while(capsule1[capsuleNumber-1])
        {
            System.out.println("Error :(");
            System.out.println("Capsule #"+capsuleNumber+" is occupied.");
            System.out.print("Capsule #[1-"+Capsule+"]: ");
            capsuleNumber= Integer.parseInt(sc.nextLine());
        }
        capsule1[capsuleNumber-1]=true;
        guests[capsuleNumber-1]=guestName;
        System.out.println("Success :)");
        System.out.println(guests[capsuleNumber-1]+" is booked in capsule #"+capsuleNumber);

    }
    /*Method to check out */
    public static void CheckOut()
    {
        System.out.println("Guest Check Out");
        System.out.println("==============");
        System.out.print("Capsule #[1-"+Capsule+"]: ");
        int capsuleNumber= Integer.parseInt(sc.nextLine());

        if(!capsule1[capsuleNumber-1])
        {
            System.out.println("Error :(");
            System.out.println("Capsule #"+capsuleNumber+" is unoccupied.");
        }
        else if(capsule1[capsuleNumber-1])
        {
            capsule1[capsuleNumber-1]=false;
            System.out.println("Capsule #"+capsuleNumber+" is checked-out.");
        }
    }


    public static void ViewGuest()
    {
        System.out.println("Capsules: Guest");
        for (int i = 0; i < guests.length; i++)
        {
            if(capsule1[i])
                System.out.println((i+1)+" : "+guests[i]);
            else
                System.out.println((i+1)+" : [unoccupied]");
            if((i+1)%10==0)
                System.out.println();
        }
    }



}