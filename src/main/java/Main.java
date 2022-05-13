import java.util.Scanner;

public class Main {          // main method, programs in java will have at least on of them

    public static void main(String[] args) {

        /*
        String myintro ="Abu said: \"I have lived here since 6.\" \nBob replied: \"where did you live before?\"";
        System.out.println(myintro);
        */

        /*
        String myname = "Richard";
        int a = myname.length();
        System.out.println(a);
        */

        /*
        int x = 3;
        int y = 7;
        System.out.println(Math.max(x, y));
        System.out.println(Math.min(x, y));
        */

       /* double num = 3.36d;
        System.out.println((int) num);

        */


        /*
       Scanner myScanner = new Scanner(System.in);

       System.out.println("What is your name");
       String myName = myScanner.nextLine();

       System.out.println("Hi my name is "+ myName);
       */



        //////////////////////////////////////////////////////////////////////////////////////////////////
/*
        System.out.println("What is the total length of your windows in meters? If you don't have a window, put 0");
        Double WindowLength = myScanner.nextDouble();

        System.out.println("What is the total width of your windows? If you don't have a window, put 0");
        Double WindowWidth = myScanner.nextDouble();

        //////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("What is the total length of your sockets? If you don't have a socket, put 0");
        Double SocketLength = myScanner.nextDouble();

        System.out.println("What is the total width of your sockets? If you don't have a socket, put 0");
        Double SocketWidth = myScanner.nextDouble();

        //////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("What is the total length of your doors? If you don't have a door, put 0");
        Double DoorLength = myScanner.nextDouble();

        System.out.println("What is the total width of your doors? If you don't have a door, put 0");
        Double DoorWidth = myScanner.nextDouble();

*/
        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is the length of the wall in meters?");
        Double WallLength = myScanner.nextDouble();

        System.out.println("What is the width of the wall in meters?");
        Double WallWidth = myScanner.nextDouble();

        System.out.println("What is the total length of your windows, doors and sockets? If you don't have any, put 0");
        Double GapLength = myScanner.nextDouble();

        System.out.println("What is the total width of your windows, doors and sockets? If you don't have any, put 0");
        Double GapWidth = myScanner.nextDouble();

        //////////////////////////////////////////////////////////////////////////////////////////////////

        Double WallArea = WallWidth*WallLength;
        Double SumArea = WallArea-GapWidth*GapLength;

        System.out.println("The area of the wall is "+ SumArea);

   /*
        Double WindowArea = WindowWidth*WindowLength;
        Double SocketArea = SocketLength*SocketWidth;
        Double DoorArea = DoorLength*DoorWidth;
   */


        //////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("What is the volume of paint in one bucket in meters cubed?");
        Double BucketVolume = myScanner.nextDouble();

        //////////////////////////////////////////////////////////////////////////////////////////////////

        Double NumberBuckets = SumArea/BucketVolume;
        System.out.println("You need to buy "+ Math.ceil(NumberBuckets)+ " buckets of paint for your wall");

        System.out.println("Input the price of one Bucket in pounds");
        Double OnePaintPrice = myScanner.nextDouble();

        //////////////////////////////////////////////////////////////////////////////////////////////////

        Double TotalPaintPrice = OnePaintPrice*Math.ceil(NumberBuckets);
        System.out.println("The total price to paint the wall is "+TotalPaintPrice);





        /*
        System.out.println("Do you have any windows, true or false");

        Boolean myBool = myScanner.nextBoolean();

        if (myBool = true) {
            System.out.println("What is the total length of your windows in meters? If you don't have a window, put 0");
            Double WindowLength = myScanner.nextDouble();

            System.out.println("What is the total width of your windows? If you don't have a window, put 0");
            Double WindowWidth = myScanner.nextDouble();

        } else {

        }



        */






















    }
}
