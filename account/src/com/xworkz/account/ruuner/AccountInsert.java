package com.xworkz.account.ruuner;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountInsert {

	public static void main(String[] args) {


		String insertQuery = "insert into account_table values(1,'laxmi','laxmi@gmail.com','hubli',9972103442,'laxmi','KVGB',50000,1122334455,true,'Savings Account','F','lax1234'),"
		+"(2, 'rakshit', 'rakshit@gmail.com', 'dwd', 9353132839, 'rakshit', 'HDFC', 75000, 2233445566, true, 'Current Account', 'M','rak456'),"
		+"(3, 'raju', 'raju@gmail.com', 'belagavi', 8784858681, 'raju', 'ICICI', 62000, 3344556677, true, 'Savings Account', 'F','raju145'),"
		+"(4, 'rohit', 'rohit@gmail.com', 'gadaga', 7845129632, 'rohit', 'Axis Bank', 90000, 4455667788, true, 'Fixed Deposit', 'M','rohit423'),"
		+"(5, 'lohit', 'lohit@gmail.com', 'mysoure', 8525351564, 'lohit', 'PNB', 45000, 5566778899, true, 'Savings Account', 'F','lohit147'),"
		+"(6, 'rohan', 'rohan@gmail.com', 'mumbai', 5432109876, 'rohan', 'Bank of Baroda', 58000, 6677889900, true, 'Current Account', 'M','rohan123'),"
		+"(7, 'harish', 'harish@gmail.com', 'bijapur', 8660084035, 'harish', 'Canara Bank', 30000, 7788990011, true, 'Recurring Deposit', 'M','harish159'),"
		+"(8, 'virat', 'virat@gmail.com', 'rona', 3210987654, 'virat', 'Union Bank', 55000, 8899001122, true, 'Business Account', 'M','virat456'),"
		+"(9, 'dharma', 'dharma@gmail.com', 'davanagere', 2109876543, 'dharma', 'IDFC First', 47000, 9900112233, true, 'Savings Account', 'M','dharma759'),"
		+"(10, 'anusha', 'anusha@gmail.com', 'tumakur', 1098765432, 'anusha', 'Yes Bank', 38000, 1001100110, true, 'Current Account', 'F','anusha124'),"
		+"(11, 'guru', 'guru@gmail.com', 'harihar', 9087654321, 'guru', 'Kotak Mahindra', 70000, 1102200334, true, 'Savings Account', 'M','guru143'),"
		+"(12, 'jayadev', 'jayadev@gmail.com', 'surat', 8976543210, 'jayadev', 'RBL Bank', 64000, 2203301445, true, 'Salary Account', 'M','jayadev123'),"
		+"(13, 'ayushi', 'ayushi@gmail.com', 'e city', 7865432109, 'ayushi', 'Bank of India', 71000, 3304402556, true, 'Current Account', 'F','ayushi145'),"
		+"(14, 'soujanya', 'soujanya@gmail.com', 'gangavati', 6754321098, 'soujanya', 'Federal Bank', 81000, 4405503667, true, 'Savings Account', 'F','sounj134'),"
		+"(15, 'renuka', 'renuka@gmail.com', 'koppala', 5643210987, 'renuka', 'South Indian Bank', 52000, 5506604778, true, 'Fixed Deposit', 'F','renu789'),"
		+"(16, 'kumar', 'kumar@gmail.com', 'ballari', 7472737689, 'kumar', 'Standard Chartered', 60000, 6607705889, true, 'Savings Account', 'M','kumar148'),"
		+"(17, 'ganga', 'ganga@gmail.com', 'hasana', 9985756589, 'ganga', 'DBS Bank', 58000, 7708806990, true, 'Business Account', 'F','ganga487'),"
		+"(18, 'paaru', 'paaru@gmail.com', 'durga', 8283817193, 'paaru', 'Karnataka Bank', 49000, 8809907001, true, 'Savings Account', 'F','paaru756'),"
		+"(19, 'poornima', 'poornima@gmail.com', 'bagalakot', 7441526389, 'poornima', 'Bank of Maharashtra', 45000, 9901100112, true, 'NRI Account', 'F','poorni143'),"
		+"(20, 'vani', 'vani@gmail.com', 'hukkeri', 4571256348, 'vani', 'Indian Overseas Bank', 55000, 1012202334, true, 'Joint Account', 'F','vani123')";

		}
	
	public String getInsertQuery()
	{
		return getInsertQuery();
	}
	
	

}
