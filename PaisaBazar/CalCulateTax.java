package PaisaBazar;

public class CalCulateTax {
    public static  float minimum_income_amount;
    public static float maximum_income_amount;
    public static float maximum_deduction_on_interest_paid_on_home_loan;
    public static  float basic_salary_received;
    public static float income_from_let_out_house_property;
    public static float basic_salary_percentage_for_hra_for_city=50/100;
    public static float Basic_salary_deduction_from_total_rent_paid = 10/100;
    public static  String  assesmentYear = "2019-2020";
    public static  String taxpayer = "Male";
    public static  int medical_insurance_premium_80d_max = 55000;
    public static final int interest_on_deposits_in_saving_account_80tta_max = 10000;
    public static final int basic_deductions_80c_max = 150000;
   void totalTaxPayableBasedOnSlab()
 {
     float totalTaxableIncomeValue=totalTaxableIncome();
 }
   int totalTaxableIncome()
 {
     int nettaxableincome=totalIncome()-totalhraExemption();
     return 0;
 }

 // Take user income as input an calaculate total income
 public  int totalIncome()
 {
int gross_salary=0;
int income_from_interest=0;
int income_from_other_sources=0;
int income_from_let_out_house_property=0;
int interest_paid_on_home_loan_let_out=0;
int interest_paid_on_home_loan=0;

/** Get User Input as assesment year */
assesmentYear="2019-2020";
     if (assesmentYear.equals( "2019-2020") || assesmentYear.equals("2018-2019")) {
         maximum_deduction_on_interest_paid_on_home_loan = 200000;
     }
     else if(assesmentYear.equals( "2017-2018")){
         maximum_deduction_on_interest_paid_on_home_loan = 9999999;
     }
     else if(assesmentYear.equals("2016-2017")){
         maximum_deduction_on_interest_paid_on_home_loan = 9999999;
     }
     int total_income=gross_salary+income_from_interest+income_from_other_sources
             +income_from_let_out_house_property+interest_paid_on_home_loan_let_out+interest_paid_on_home_loan;
     Math.round(total_income);
     return total_income;
 }
public int totalhraExemption()
{
int basic_salary_received=0;
int hra_received=0;
int total_rent_paid=0;
int dearness_allowance_received=0;

// get minmum

float hraexception=Math.min(Math.min(basic_salary_percentage_for_hra_for_city*basic_salary_received
        ,hra_received),((total_rent_paid)-(basic_salary_received+dearness_allowance_received))*Basic_salary_deduction_from_total_rent_paid);

return  (int)hraexception;
}

float totalDeducation()
{
    int basic_deductions_80c=0;
     int interest_on_deposits_in_saving_account_80tta=0;
     int donation_to_charity_80g=0;
     int medical_insurance_premium_80d=0;
     int interest_on_educational_loan_80e=0;
return 0;
};

    public static void main(String[] args) {
      CalCulateTax calCulateTax=new CalCulateTax();
      calCulateTax.totalTaxPayableBasedOnSlab();
    }

}
