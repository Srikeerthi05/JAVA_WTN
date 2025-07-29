import java.util.*;
public class Project1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int searchId = Integer.parseInt(args[0]);

        // Employee details
        int[] empId = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
        String[] empName = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
        String[] joinDate = {"01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "1/1/2000", "12/06/2006"};
        char[] desigCode = {'e', 'c', 'k', 'r', 'm', 'e', 'c'};
        String[] department = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
        int[] basic = {20000, 30000, 10000, 12000, 50000, 23000, 29000};
        int[] hra = {8000, 12000, 8000, 6000, 20000, 9000, 12000};
        int[] it = {3000, 9000, 1000, 2000, 20000, 4400, 10000};

        // Designation details
        char[] designationCode = {'e', 'c', 'k', 'r', 'm'};
        String[] designationTitle = {"Engineer", "Consultant", "Clerk", "Receptionist", "Manager"};
        int[] da = {20000, 32000, 12000, 15000, 40000};

    
        boolean found = false;
        for (int i = 0; i < empId.length; i++) {
            if (empId[i] == searchId) {
                found = true;
                int employeeDA = 0;
                String designation = "";
                for (int j = 0; j < designationCode.length; j++) {
                    if (desigCode[i] == designationCode[j]) {
                        employeeDA = da[j];
                        designation = designationTitle[j];
                        break;
                    }
                }
                int salary = basic[i] + hra[i] + employeeDA - it[i];
                System.out.println("Emp No.\t\tEmp Name\t\tDepartment\t\tDesignation\t\tSalary");
                System.out.println(empId[i] + "\t\t" + empName[i] + "\t\t\t" + department[i] + "\t\t\t" + designation + "\t\t\t" + salary);
                break;
            }
        }
        if (!found) {
            System.out.println("There is no employee with empid : " + searchId);
        }
    }
}
