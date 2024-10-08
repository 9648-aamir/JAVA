package upCasting;

public class Loan {
int loan_no;
double amount;
double roi;

Loan(){
	
}

Loan(int loan_no,double amount, double roi){
	this.loan_no=loan_no;
	this.amount=amount;
	this.roi=roi;
}

public void displayLoan() {
	System.out.println("Loan no is:"+loan_no);
	System.out.println("Amount is:"+amount);
	System.out.println("Rate of Intrest is:"+roi);
}
}
