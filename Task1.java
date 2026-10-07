import java.util.Scanner;


public class Task1 {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.print("Введіть першу дату (день.місяць.рік): ");


        String date1 = scanner.nextLine();


        System.out.print("Введіть другу дату (день.місяць.рік): ");


        String date2 = scanner.nextLine();


        String[] parts1 = date1.split("\\.");


        String[] parts2 = date2.split("\\.");


        int day1 = Integer.parseInt(parts1[0]);


        int month1 = Integer.parseInt(parts1[1]);


        int year1 = Integer.parseInt(parts1[2]);


        int day2 = Integer.parseInt(parts2[0]);


        int month2 = Integer.parseInt(parts2[1]);


        int year2 = Integer.parseInt(parts2[2]);


        if (year1 < year2) {


            System.out.println("Перша дата є ранішою.");


            System.out.println("Друга дата є пізнішою.");


        } else if (year1 > year2) {


            System.out.println("Друга дата є ранішою.");


            System.out.println("Перша дата є пізнішою.");


        } else if (month1 < month2) {


            System.out.println("Перша дата є ранішою.");


            System.out.println("Друга дата є пізнішою.");


        } else if (month1 > month2) {


            System.out.println("Друга дата є ранішою.");


            System.out.println("Перша дата є пізнішою.");


        } else if (day1 < day2) {


            System.out.println("Перша дата є ранішою.");


            System.out.println("Друга дата є пізнішою.");


        } else if (day1 > day2) {


            System.out.println("Друга дата є ранішою.");


            System.out.println("Перша дата є пізнішою.");


        } else {


            System.out.println("Дати однакові.");


        }


        scanner.close();


    }


}