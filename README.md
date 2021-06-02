# Salary Calculator

Christa Verbsky

## Description

The SalaryCalculator application parses a preexisting CSV file to calculate salaries for each individual depending on employee role. The CSV file will be in the format, "Name,Rate,Hour,Role". After compiling, user will enter command to run the application with two additional arguments in the format "filename.csv total" or "filename.csv totalbyrole". The command "total" will result in printing each employee's total salary in dollars. The command "totalbyrole" will result in printing each total salary separated by role.

## Verification

An included CSV file titled "EmployeePay.csv" should produce the following output when application is compiled and run:

#### total:

Employee Salaries



John Smith:     $20000.00

Karen Palm:     $23100.00

Rick Bob:      $36400.00

Bob Ross:      $29900.00

Dillon White:    $33600.00

Susan Smith:     $47500.00

Ruth Less:      $41600.00

Linda Bell:     $45900.00

Billy Bob:      $60400.00

Jane Doe:      $50000.00



#### totalbyrole:

Employee Salaries by Role



Full Time Employees

Bob Ross:      $29900.00

Ruth Less:      $41600.00

Jane Doe:      $50000.00



Part Time Employees

John Smith:     $20000.00

Karen Palm:     $23100.00

Dillon White:    $33600.00

Linda Bell:     $45900.00



Contract Employees

Rick Bob:      $36400.00

Susan Smith:     $47500.00

Billy Bob:      $60400.00

