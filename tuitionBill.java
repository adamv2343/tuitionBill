
public class tuitionBill {
	double tuitionRate = 12520;
	double APR = .06;
	int yearsOfPayments = 10;
	double yearlyRateIncrease = 0.029;
	double year1 = tuitionRate;
	double year2 = (tuitionRate + tuitionRate * yearlyRateIncrease);
	double year3 = (year2 + year2 * yearlyRateIncrease);
	double year4 = (year3 + year3 * yearlyRateIncrease);
	double loan = (year1 + year2 + year3 + year4);
	double repayment = (loan + loan * APR * yearsOfPayments);
	double monthlyPayment = (repayment / 120);
	
	
	
}