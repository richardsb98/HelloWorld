import java.util.Scanner;

public class Painter_Calculator {

    public static void main(String[] args) {

        /*
        String myintro ="Abu said: \"I have lived here since 6.\" \nBob replied: \"where did you live before?\"";
        System.out.println(myintro);
        */

        /*
        String myname = "Richard";
        int a = myname.length();                             //counts length of string
        System.out.println(a);
        */

        /*
        int x = 3;
        int y = 7;
        System.out.println(Math.max(x, y));                 // prints the maximum value between x and y
        System.out.println(Math.min(x, y));                 // prints the minimum value between x and y
        */

       /* double num = 3.36d;
        System.out.println((int) num);                      //prints rounded down integer of num

        */


        /*
       Scanner myScanner = new Scanner(System.in);

       System.out.println("What is your name");                   //asks user for input
       String myName = myScanner.nextLine();                      //reads input from user into code

       System.out.println("Hi my name is "+ myName);             //prints out user input plus code
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

      /*
        switch(quantity) {
        case 0 :
            System.out.println("")

        }
        */

        /*
        int i = 5;
        while (i <100) {
            System.out.println("$" + i);          // while loop
            i += 5;  // i= i+5


        do {
            //code                           //do while loop
        }
        while (condition)
         */

        /*
        int[] myIntlist = {1,2,3,4,5};
        int[] myIntlist = new int[7];        // 7 variables in list
         int[] myIntlist = new int[7];

         myIntlist[0] = 3;

         myIntlist
         String[] myStringarray = new String[10];
*/

/*
            int i = 1;
            while (i<6) {
                System.out.println(i);
                i++;
            }


            int i = 1;
            do {
                System.out.println(i);
                i++;
            }
            while (i<6);




        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int getNumber = keyboard.nextInt();
        int x;
        int total = 0;
        for (x=1;x <= getNumber;x++) {
            total = total + x;
        }
        System.out.println(total);
    }}

*/


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        Scanner myScanner = new Scanner(System.in);


        System.out.println("How many walls are you painting");
        Integer NumberWalls = myScanner.nextInt();


        //////////////////////////////////////////////////////////////////////////////////////////////////

        if (NumberWalls == 1) {


            System.out.println("Do you have any obstructions on this wall? (e.g doors, sockets, windows etc), true or false");
            Boolean WSD = myScanner.nextBoolean();

            if (WSD == true) {

                System.out.println("What is the total length of your obstructions on this wall in meters?");
                Double GapLength = myScanner.nextDouble();

                System.out.println("What is the total height of your obstructions on this wall in meters?");
                Double GapWidth = myScanner.nextDouble();


                System.out.println("What is the length of the wall in meters?");
                Double WallLength = myScanner.nextDouble();

                System.out.println("What is the height of the wall in meters?");
                Double WallWidth = myScanner.nextDouble();


                Double WallArea = WallWidth * WallLength;
                Double SumArea = WallArea - GapWidth * GapLength;


                System.out.println("The area of the wall is " + SumArea);

                System.out.println("What is the volume of paint in one bucket in meters cubed?");
                Double BucketVolume = myScanner.nextDouble();


                Double NumberBuckets = WallArea / BucketVolume;
                System.out.println("You need to buy " + Math.ceil(NumberBuckets) + " buckets of paint for your wall");

                System.out.println("Input the price of one Bucket in pounds");
                Double OnePaintPrice = myScanner.nextDouble();

                Double TotalPaintPrice = OnePaintPrice * Math.ceil(NumberBuckets);
                System.out.println("The total price to paint the wall is " + TotalPaintPrice);

            } else {

                System.out.println("What is the length of the wall in meters?");
                Double WallLength = myScanner.nextDouble();

                System.out.println("What is the height of the wall in meters?");
                Double WallWidth = myScanner.nextDouble();


                Double WallArea = WallWidth * WallLength;
                System.out.println("The area of the wall is " + WallArea);


                System.out.println("What is the volume of paint in one bucket in meters cubed?");
                Double BucketVolume = myScanner.nextDouble();


                Double NumberBuckets = WallArea / BucketVolume;
                System.out.println("You need to buy " + Math.ceil(NumberBuckets) + " buckets of paint for your wall");

                System.out.println("Input the price of one Bucket in pounds");
                Double OnePaintPrice = myScanner.nextDouble();


                Double TotalPaintPrice = OnePaintPrice * Math.ceil(NumberBuckets);
                System.out.println("The total price to paint the wall is " + TotalPaintPrice);


            }
        }
        if (NumberWalls > 1) {

            for (int i = 0; i < NumberWalls; i++) {

                System.out.println("Do you have any obstructions on this wall? (e.g doors, sockets, windows etc), true or false");
                Boolean Obstructions = myScanner.nextBoolean();

                if (Obstructions == true) {

                    System.out.println("What is the total length of your obstructions in meters?");
                    Double GapLength = myScanner.nextDouble();

                    System.out.println("What is the total height of your obstructions in meters?");
                    Double GapWidth = myScanner.nextDouble();


                    System.out.println("What is the length of the wall in meters?");
                    Double WallLength = myScanner.nextDouble();

                    System.out.println("What is the height of the wall in meters?");
                    Double WallWidth = myScanner.nextDouble();


                    Double WallArea = WallWidth * WallLength;
                    Double SumArea = WallArea - GapWidth * GapLength;


                    System.out.println("The area of the wall is " + SumArea);

                    System.out.println("What is the volume of paint in one bucket in meters cubed?");
                    Double BucketVolume = myScanner.nextDouble();


                    Double NumberBuckets = WallArea / BucketVolume;
                    System.out.println("You need to buy " + Math.ceil(NumberBuckets) + " buckets of paint for your wall");

                    System.out.println("Input the price of one Bucket in pounds");
                    Double OnePaintPrice = myScanner.nextDouble();

                    Double TotalPaintPrice = OnePaintPrice * Math.ceil(NumberBuckets);
                    System.out.println("The total price to paint the wall is " + TotalPaintPrice);

                } else {

                    System.out.println("What is the length of the wall in meters?");
                    Double WallLength = myScanner.nextDouble();

                    System.out.println("What is the height of the wall in meters?");
                    Double WallWidth = myScanner.nextDouble();


                    Double WallArea = WallWidth * WallLength;
                    System.out.println("The area of the wall is " + WallArea);


                    System.out.println("What is the volume of paint in one bucket in meters cubed?");
                    Double BucketVolume = myScanner.nextDouble();


                    Double NumberBuckets = WallArea / BucketVolume;
                    System.out.println("You need to buy " + Math.ceil(NumberBuckets) + " buckets of paint for your wall");

                    System.out.println("Input the price of one Bucket in pounds");
                    Double OnePaintPrice = myScanner.nextDouble();


                    Double TotalPaintPrice = OnePaintPrice * Math.ceil(NumberBuckets);
                    System.out.println("The total price to paint this wall is " + TotalPaintPrice);


                    while (i > 1) {
                        Scanner keyboard = new Scanner(System.in);
                        System.out.println("Input the price of wall");
                        int getNumber = keyboard.nextInt();
                        int x;
                        int total = 0;
                        for (x=1;x <= getNumber;x++) {
                            total = total + x;
                        }
                        System.out.println(total);

                    }


                }


            }


        }

    }

}










