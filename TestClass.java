package newpackage;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestClass {

    public static void main(String[] args) {

        try {

            Assistent e1 = new Assistent("ahmad", 3321, 3000);
            Assistent.empList.add(e1);
            Assistent e2 = new Assistent("mohamd", 7643, 3000);
            Assistent.empList.add(e2);
            Assistent e3 = new Assistent("abdo", 9327, 3000);
            Assistent.empList.add(e3);
            Assistent e4 = new Assistent("josh", 6231, 3000);
            Assistent.empList.add(e4);
            Assistent e5 = new Assistent("maik", 4321, 3000);
            Assistent.empList.add(e5);
            Assistent e6 = new Assistent("mark", 1542, 3000);
            Assistent.empList.add(e6);
            Assistent e7 = new Assistent("omar", 05621, 3000);
            Assistent.empList.add(e7);
            Assistent e8 = new Assistent("fahad", 5974, 3000);
            Assistent.empList.add(e8);
            Assistent e9 = new Assistent("ali", 1264, 3000);
            Assistent.empList.add(e9);
            Assistent e10 = new Assistent("saad", 6715, 3000);
            Assistent.empList.add(e10);
        } // public static ArrayList<employee> empList = new ArrayList<employee>();
        catch (IndexOutOfBoundsException e) {
            System.out.println("Sorry we're out of assistents :(");
        }

        Management m = new Management();
        Payment pay = new Payment();
        PInformation cus = new customer();
        Trolley care = new Trolley();
        int f = 0;

        Scanner in = new Scanner(System.in);
        Scanner in1 = new Scanner(System.in);
        Scanner in3 = new Scanner(System.in);

        System.out.println("Welcom to Tasheel !!" + "\nSign up !");
        System.out.println("Are you a manager or a customer");
        String x = in.nextLine();
        if (!("manager".equals(x) || "customer".equals(x))) {
            System.err.println("PLEASE ENRET : CUSTOMER OR MANAGER!");
            TestClass.main(args);
        }
        switch (x) {
            case "manager":
                System.out.println("Enter the password: ");
                long pass = in.nextLong();
                if (pass == 12345) {
                    do {
                        System.out.println("choose the opation :\n"
                                + "1- add assistent\n"
                                + "2- show all Appointments\n"
                                + "3- remove assistent \n"
                                + "4- update an assistent\n"
                                + "5- show all assistents \n"
                                + "6- Quit the program"
                        );
                        System.out.println("Enter the option: ");
                        try {
                            int n = in.nextInt();
                            if (n == 1 || n == 2 || n == 3 || n == 4 || n == 5 || n == 6) {
                                switch (n) {

                                    case 1:
                                        m.addEmp();
                                        break;

                                    case 2:
                                        care.myAppointments();
                                        break;
                                    case 3:
                                        m.removeEmp();
                                        break;
                                    case 4:
                                        m.updateEmployee();
                                        break;
                                    case 5:
                                        m.displayall();
                                        break;
                                    case 6:

                                        System.out.println(" Have a nice day (:");
                                        TestClass.main(args);
                                        continue;

                                }
                            } else {
                                System.out.println("there is no " + n + " in the list");
                            }
                        } catch (InputMismatchException h) {
                            System.err.println("Enter a number please!!");
                            break;
                        };

                    } while (true);

                } else {
                    System.out.println("The password is incorrect ");
                    break;
                }

            case "customer":
                System.out.println(cus.inform());

                do {

                    System.out.println("-----Menu-----");
                    System.out.println("choose the Trolley you need\n"
                            + "1- Baby Trolley\t \n"
                            + "2- Luggage Trolley\n" //
                            + "3- Hanndicapped Trolley     \n"
                            + "4- show my Appointments\n"
                            + "5- Cancle an Appointment\n"
                            + "6- Quit the program\n"
                    );
                    System.out.println("Enter the option: ");
                    //Control variable entered by user
                    try {

                        int n = in.nextInt();
                        if (n == 1 || n == 2 || n == 3 || n == 4 || n == 5 || n == 6) {

                            switch (n) {
                                case 1:
                                    Date date = new Date();
                                    Baby b = new Baby();
                                    b.setTroCap(b.ask());
                                    date.ask();
                                    care.trolist.add(b);
                                    b.setDate(date);
                                    b.setEmp(care.needs(f));
                                    f++;
                                    pay.ask();
                                    System.out.print(b.toString() + "\n");

                                    break;

                                case 2:
                                    Date date1 = new Date();
                                    Luggage l = new Luggage();
                                    l.ask();
                                    date1.ask();
                                    care.trolist.add(l);
                                    l.setDate(date1);
                                    l.setEmp(care.needs(f));
                                    f++;
                                    pay.ask();
                                    System.out.print(" " + l.toString() + "\n");

                                    break;
                                case 3:
                                    Date date2 = new Date();
                                    Handicapped h = new Handicapped();
                                    h.ask();
                                    date2.ask();
                                    care.trolist.add(h);
                                    h.setDate(date2);
                                    h.setEmp(care.needs(f));
                                    f++;
                                    pay.ask();
                                    System.out.print(" " + h.toString() + "\n");

                                    break;

                                case 4:
                                    care.myAppointments();
                                    break;

                                case 5:
                                    care.cancle();
                                    break;

                                case 6:

                                    System.out.println(" Have a nice day (:");
                                    TestClass.main(args);
                                    continue;
                                default:
                                    continue;
                            }
                        } else {
                            System.out.println("there is no " + n + " in the list");
                        }

                    } catch (InputMismatchException h) {
                        System.err.println("Enter a number please!!");
                        break;
                    }
                } while (true);

        }
    }
}
