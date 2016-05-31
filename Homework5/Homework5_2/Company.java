package homework5;

public class Company {

	private Transportation[] kind;
	private Transportation temp;
	
	Company(){
		kind=new Transportation[5];
		kind[0]=new Bicycle();
		kind[1]=new Motorcycle();
		kind[2]=new Car();
		kind[3]=new Airplane();
		kind[4]=new Rocket();
	}
	
	public void whatKindofTransportation(int price, String start, String end){
		
		if(price>=100 && price<500){
			temp=kind[0];
		}else if(price>=500 && price<2000){
			temp=kind[1];
		}else if(price>=2000 && price<30000){
			temp=kind[2];
		}else if(price>=30000 && price<=100000){
			temp=kind[3];
		}else if(price>=100000){
			temp=kind[4];
		}else{
			System.out.println("Wrong price!!");
			return;
		}
		temp.select();
		temp.price=price;
		temp.start=start;
		temp.end=end;
		temp.addTotalCount();
		temp.addTotalPrice(price);
		temp.isTraveling();
	}
	
	public int getProfit(){
		return temp.getProfit();
	}
	
	public int getCount(){
		return temp.getTotalCount();
	}
	
	public void showTransportationUseRate(){
		System.out.println("Bicycle: "+kind[0].count+" times, Use rate: "+getTransportationUseRate(kind[0])+"%");
		System.out.println("Motorcycle: "+kind[1].count+" times, Use rate: "+getTransportationUseRate(kind[1])+"%");
		System.out.println("Car: "+kind[2].count+" times, Use rate: "+getTransportationUseRate(kind[2])+"%");
		System.out.println("Airplane: "+kind[3].count+" times, Use rate: "+getTransportationUseRate(kind[3])+"%");
		System.out.println("Rocket: "+kind[4].count+" times, Use rate: "+getTransportationUseRate(kind[4])+"%");
	}
	
	public Double getTransportationUseRate(Transportation transportation){
		return (double)transportation.count/temp.getTotalCount()*100;
	}
}
