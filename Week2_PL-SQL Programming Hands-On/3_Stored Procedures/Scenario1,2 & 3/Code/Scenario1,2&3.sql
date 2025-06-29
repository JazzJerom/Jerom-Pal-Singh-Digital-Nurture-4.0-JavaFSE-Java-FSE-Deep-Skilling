
-- SCENARIO 1 – Add 1% Interest to Savings Accounts
BEGIN
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01),
        LastModified = SYSDATE
    WHERE AccountType = 'Savings';
    COMMIT;
END;
/

--SCENARIO 2 – Add 10% Bonus to IT Employees
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * 0.10)
    WHERE Department = 'IT';
    COMMIT;
END;
/

--SCENARIO 3 – Transfer 100 from Account 1 to 2
DECLARE
    v_balance NUMBER;
BEGIN
    SELECT Balance INTO v_balance FROM Accounts WHERE AccountID = 1 FOR UPDATE;
    IF v_balance >= 100 THEN
        UPDATE Accounts SET Balance = Balance - 100 WHERE AccountID = 1;
        UPDATE Accounts SET Balance = Balance + 100 WHERE AccountID = 2;
    END IF;
    COMMIT;
END;
/

