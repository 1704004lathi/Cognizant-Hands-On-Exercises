CREATE TABLE Accounts (
    AccountID      NUMBER PRIMARY KEY,
    CustomerID     NUMBER,
    AccountType    VARCHAR2(20),
    Balance        NUMBER(12, 2)
);

INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance)
VALUES (101, 1, 'SAVINGS', 1000.00);

INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance)
VALUES (102, 2, 'SAVINGS', 2500.00);

INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance)
VALUES (103, 3, 'CURRENT', 3000.00);

COMMIT;

CREATE TABLE Employees (
    EmpID         NUMBER PRIMARY KEY,
    Name          VARCHAR2(100),
    DepartmentID  NUMBER,
    Salary        NUMBER(10, 2)
);

INSERT INTO Employees (EmpID, Name, DepartmentID, Salary)
VALUES (1, 'Alice', 10, 5000);

INSERT INTO Employees (EmpID, Name, DepartmentID, Salary)
VALUES (2, 'Bob', 20, 6000);

INSERT INTO Employees (EmpID, Name, DepartmentID, Salary)
VALUES (3, 'Charlie', 10, 5500);

COMMIT;