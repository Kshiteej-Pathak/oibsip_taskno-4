import java.util.*;

public class Online_Examination {
    public static void main(String[] args) {
        int ch=4;
        int choice;
        String name;
        int id=0;
        int end=1;
        Scanner in=new Scanner(System.in);
        try{
        System.out.print("Enter your username :");
        name=in.next();
        System.out.print("Enter your Roll number :");
        id=in.nextInt();
        int count=0;
        clrscr();
        System.out.println("\t\t!! Welcome "+name+" roll no. "+id+"to Online Examination !!");

        do
        {
            System.out.println("1.Take Examination ");
            System.out.println("2.Show Marks");
            System.out.println("3.Exit");
            System.out.print("Enter your choice:");
            ch=in.nextInt();
            switch(ch)
            {
                case 1:
                {
                    clrscr();
                    System.out.println("There are 5 questions in the examination");


                    System.out.println("Each question consist of 4 option you have to choose correct answer");
                   
                    count=0;
                    clrscr();
                    System.out.println("** Q1) What is the size of float and double in java? :");
                    System.out.println("1.32 and 64\n2.64 and 32\n3.16 and 32\n4.64 and 64");
                    System.out.print("Enter your answer:");
                    choice=in.nextInt();
                    if(choice==1)
                    {
                        count++;
                    }
                    clrscr();
                    System.out.println("** Q2)Automatic type conversion is possible in which of the possible cases?:");
                    System.out.println("1.byte to int\n2.int to long\n3.long to int \n4.short to int");
                    System.out.print("Enter your answer:");
                    choice=in.nextInt();
                    if(choice==2)
                    {
                        count++;
                    }
                    clrscr();
                    System.out.println("** Q3)Select the valid statement.:");

                    System.out.println("1.char[] ch= new char(5) \n2.char[] ch= new char[5]\n3.char[] ch= new char()\n4.char[] ch= new char[]");
                    System.out.print("Enter your answer :");
                    choice=in.nextInt();
                    if(choice==2)
                    {
                        count++;
                    }
                    clrscr();
                    System.out.println("** Q4)When an array is passed to a method, what does the method receive? :");
                    System.out.println("1.Copy of First Element\n2.Length of the Array\n3.The Reference of the Array\n4.None");
                    System.out.print("Enter answer:");
                    choice=in.nextInt();
                    if(choice==3)
                    {
                        count++;
                    }
                    clrscr();
                    System.out.println("** Q5)Total constructor string class have?:");
                    System.out.println("1.3\n2.7\n3.20\n4.13");
                    System.out.print("Enter answer:");
                    choice=in.nextInt();
                    if(choice==4)
                    {
                        count++;
                    }
                    clrscr();
                    break;
                }
                case 2:
                    clrscr();
                    System.out.println("Congratulations !!  "+name+"  You scored "+count+" marks"+" out of 5");
                    System.out.println("Press 0 for exit");
                    end=in.nextInt();
                    clrscr();
                    break;

                case 3:
                    System.exit(end);
                
                default:
                    clrscr();
                    System.out.println("Enter valid options");


            }


        }while(true);
    }
    finally{
        in.close();
    }
    }

    public static final void clrscr() {
        try {
            try {
                final String os = System.getProperty("os.name");

                if (os.contains("Windows")) {
                    Runtime.getRuntime().exec("cls");
                } else {
                    Runtime.getRuntime().exec("clear");
                }
            } catch (final Exception e) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
        } catch (final Exception es) {
            // System.out.println("nothing here!");
        }

    }
}
