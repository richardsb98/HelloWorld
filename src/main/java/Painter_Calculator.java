import java.util.Scanner;

public class Painter_Calculator {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("How many walls are you painting");
        Integer NumberWalls = myScanner.nextInt();

        if (NumberWalls == 1) {

            System.out.println("Do you have any obstructions on this wall? (e.g doors, sockets, windows etc), true or false");
            Boolean Obstructions = myScanner.nextBoolean();

            if (Obstructions == true) {

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
                System.out.println("The total price to paint the wall is £" + TotalPaintPrice);

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

            Double TotalPaintPrice = 0.0;

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

                    Double PaintPrice = OnePaintPrice * Math.ceil(NumberBuckets);
                    System.out.println("The price to paint the wall is £" + PaintPrice + "\nNext Wall");

                    TotalPaintPrice += PaintPrice;

                }
                else {

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


                    Double PaintPrice = OnePaintPrice * Math.ceil(NumberBuckets);
                    System.out.println("The price to paint this wall is £" + PaintPrice + "\nNext Wall");


                    TotalPaintPrice += PaintPrice;

                    /*  array
                    Double [] Final = {Math.ceil(NumberBuckets), OnePaintPrice, PaintPrice};

                    System.out.println(Final[1] + "buckets required, at a cost of £" + Final[2] + "per bucket, this will cost a total of £" + Final[3]);
*/


                    }


                }

         //   System.out.println("The total cost to paint all " + NumberWalls +" walls is £" + TotalPaintPrice);


            }


        }

    }

