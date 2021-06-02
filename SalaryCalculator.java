import java.util.*;
import java.io.*;


public class SalaryCalculator {

    public static void main(String [] args) {

        if (args.length != 2)
        {
            System.out.println("Invalid number of args.");
            return;
        }

        // Employee Lists
        Vector<Employee> employeeRates = new Vector<>();
        Vector<Employee> fullTime = new Vector<>();
        Vector<Employee> partTime = new Vector<>();
        Vector<Employee> contract = new Vector<>();

        /* Parse File and Fill Employee Lists */
        try
        {
            InputStream myFile = new FileInputStream(args[0]);
            Scanner scnr = new Scanner(myFile);

            scnr.useDelimiter(",");

            String header = scnr.nextLine();
            while (scnr.hasNext())
            {
                // Parsing
                String nextLine = scnr.nextLine();
                String delim = "[,]";
                String[] tokens = nextLine.split(delim);

                Employee tempE = new Employee();
                tempE.name = tokens[0];
                tempE.rate = Integer.parseInt(tokens[1]);
                tempE.hours = Integer.parseInt(tokens[2]);
                tempE.role = tokens[3];

                // Salary Calculations
                if (tempE.role.equals("FULL TIME"))
                {
                    if (tempE.hours * tempE.rate <= 50000)
                        tempE.salary = tempE.hours * tempE.rate;
                    else
                        tempE.salary = 50000;

                    fullTime.add(tempE);
                }

                else if (tempE.role.equals("PART TIME"))
                {
                    tempE.salary = tempE.hours * tempE.rate;
                    partTime.add(tempE);
                }

                else if (tempE.role.equals("CONTRACT"))
                {
                    tempE.salary = 10000 + tempE.hours * tempE.rate;
                    contract.add(tempE);
                }

                employeeRates.add(tempE);
            }
        }
        catch (IOException ex)
        {
            System.out.println("Error opening file, " + args[0] + ".");
            return;
        }


        /* Print Results */
        if (args[1].equals("total"))
        {
            System.out.println("\nEmployee Salaries\n");

            for (Employee e : employeeRates)
            {
                System.out.printf("%-20s $%.2f%n", e.name + ":", e.salary);
            }

            System.out.println();
        }

        else if (args[1].equals("totalbyrole"))
        {
            System.out.println("\nEmployee Salaries by Role\n");

            System.out.println("Full Time Employees");
            for (Employee e : fullTime)
            {
                System.out.printf("%-20s $%.2f%n", e.name + ":", e.salary);
            }
            System.out.println();

            System.out.println("Part Time Employees");
            for (Employee e : partTime)
            {
                System.out.printf("%-20s $%.2f%n", e.name + ":", e.salary);
            }
            System.out.println();

            System.out.println("Contract Employees");
            for (Employee e : contract)
            {
                System.out.printf("%-20s $%.2f%n", e.name + ":", e.salary);
            }
            System.out.println();
        }

        else
        {
            System.out.println("\nPlease enter valid command. (\"total\" OR \"totalbyrole\")\n");
        }

    }

}
