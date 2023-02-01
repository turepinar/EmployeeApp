package stepdefinitions.employeeSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.employeePage.employeeData;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeSearchSteps {


    private Object Array;
    employeeData employeeHomePage = new employeeData();
    Scanner scanner = new Scanner(System.in);


    @Given("I have an array of employee records that include their birthday.")
    public void i_have_an_array_of_employee_records_that_include_their_birthday() {
        employeeHomePage.employee();
    }


    @When("I execute this application program with the array of employees.")
    public void i_execute_this_application_program_with_the_array_of_employees() {
        System.out.println(Arrays.toString(employeeHomePage.employee()));
    }

    @Then("I am returned an array of employees who's birthday is in the {string} month.")
    public void i_am_returned_an_array_of_employees_who_s_birthday_is_in_the_month(String month) {
        int a = 0;
        for (int i = 0; i < employeeHomePage.employee().length; i++) {
            if (employeeHomePage.employee()[i].contains(month)) {
                a++;
            }
        }


        String[] res = new String[a];
        for (int i = 0, j = 0; i < employeeHomePage.employee().length; i++) {
            if (employeeHomePage.employee()[i].contains(month)) {
                res[j] = employeeHomePage.employee()[i];
                res[j] = res[j].substring(0, res[j].indexOf("-") - 1);
                j++;
            }
        }
        System.out.println(Arrays.toString(res));

    }
}





