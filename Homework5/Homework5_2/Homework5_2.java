package homework5;

public class Homework5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company company=new Company();
		Customer customer=new Customer();
		
		for(int i=0;i<200;i++){
			company.whatKindofTransportation(customer.price(), "Taipei", "Kaohsiung");
		}
		
		System.out.println("Total count: "+company.getCount());
		System.out.println("Profit: "+company.getProfit());
		company.showTransportationUseRate();
	}

}
