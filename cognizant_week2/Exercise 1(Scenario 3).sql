BEGIN
    FOR loan_rec IN (
        SELECT l.LoanID, l.CustomerID, l.DueDate, c.Name
        FROM Loans l
        JOIN Customers c ON l.CustomerID = c.CustomerID
        WHERE l.DueDate BETWEEN SYSDATE AND SYSDATE + 30
    ) LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Loan ' || loan_rec.LoanID || 
                             ' for customer ' || loan_rec.Name || 
                             ' is due on ' || TO_CHAR(loan_rec.DueDate, 'DD-MON-YYYY'));
    END LOOP;
END;