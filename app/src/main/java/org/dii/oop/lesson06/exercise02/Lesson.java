package org.dii.oop.lesson06.exercise02;
import java.util.Scanner;
import java.util.ArrayList; //this exercise MUST use extended version of arrayList

public class Lesson {
    public static void run() {
        CustomArrayList list = new CustomArrayList();
        Scanner in = new Scanner(System.in);

        do {
            System.out.println();
            //print menu as instructed in MD file
            System.out.println("""
                    1. Circle
                    2. Rectangle
                    3. Square
                    4. Display all shape
                    5. Show summation of area
                    6. exit""");

            String choice = in.nextLine().trim();

            // TODO: write your code here

            if ("1".equals(choice)) {
                System.out.print("Enter radius: ");
                String strRadius = in.nextLine();
                list.add(new Circle("Circle",strRadius));


                //store to arrayList
            }
            if ("2".equals(choice)) {
                System.out.print("Enter width: ");
                String strWidth = in.nextLine();
                System.out.print("Enter height: ");
                String strHeight = in.nextLine();
                list.add(new Rectangle("Rectangle",strWidth,strHeight));


                //store to arrayList
            }
            if ("3".equals(choice)) {
                System.out.print("Enter side: ");
                String strSide = in.nextLine();
                list.add(new Square("Square",strSide));
                //store to arrayList
            }
            if ("4".equals(choice)) {
                System.out.print("List all shape: \n");
                list.listAllShapes();
                //print data as instructed
                //check how to iterate through arrayList

                //HINT3: you can use getClass() function of arrayList to get the name of class. It might be useful : )
            }
            if("5".equals(choice)){
                list.sumArea();
            }
            if ("6".equals(choice)) {
                break;
            }

            //interesting ops


            if ("6".equals(choice)) {
                 break;
            }
           
        } while(true);

        //in.close();
    }
}