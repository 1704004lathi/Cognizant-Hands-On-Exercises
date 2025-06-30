CREATE TABLE Customers (
    CustomerID     NUMBER PRIMARY KEY,
    Name           VARCHAR2(100),
    DateOfBirth    DATE,
    Balance        NUMBER(12, 2),
    IsVIP          VARCHAR2(5) DEFAULT 'FALSE'
);


CREATE TABLE Loans (
    LoanID         NUMBER PRIMARY KEY,
    CustomerID     NUMBER,
    InterestRate   NUMBER(5, 2),
    DueDate        DATE,
    CONSTRAINT fk_customer
        FOREIGN KEY (CustomerID)
        REFERENCES Customers(CustomerID)
);


INSERT INTO Customers (CustomerID, Name, DateOfBirth, Balance, IsVIP)
VALUES (1, 'Alice Johnson', TO_DATE('1950-05-20', 'YYYY-MM-DD'), 15000.00, 'FALSE');

INSERT INTO Customers (CustomerID, Name, DateOfBirth, Balance, IsVIP)
VALUES (2, 'Bob Smith', TO_DATE('1985-11-10', 'YYYY-MM-DD'), 8000.00, 'FALSE');

INSERT INTO Customers (CustomerID, Name, DateOfBirth, Balance, IsVIP)
VALUES (3, 'Charlie Brown', TO_DATE('1962-07-15', 'YYYY-MM-DD'), 12000.00, 'FALSE');

INSERT INTO Customers (CustomerID, Name, DateOfBirth, Balance, IsVIP)
VALUES (4, 'Diana Prince', TO_DATE('1990-02-28', 'YYYY-MM-DD'), 9500.00, 'FALSE');

INSERT INTO Customers (CustomerID, Name, DateOfBirth, Balance, IsVIP)
VALUES (5, 'Edward King', TO_DATE('1948-03-03', 'YYYY-MM-DD'), 20000.00, 'FALSE');


Select * from Customers


INSERT INTO Loans (LoanID, CustomerID, InterestRate, DueDate)
VALUES (101, 1, 7.50, SYSDATE + 10);

INSERT INTO Loans (LoanID, CustomerID, InterestRate, DueDate)
VALUES (102, 2, 6.25, SYSDATE + 40);

INSERT INTO Loans (LoanID, CustomerID, InterestRate, DueDate)
VALUES (103, 3, 8.00, SYSDATE + 5);

INSERT INTO Loans (LoanID, CustomerID, InterestRate, DueDate)
VALUES (104, 4, 7.00, SYSDATE + 29);

INSERT INTO Loans (LoanID, CustomerID, InterestRate, DueDate)
VALUES (105, 5, 6.75, SYSDATE + 60);



Select * from Loans