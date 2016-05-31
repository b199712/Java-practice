package enumtest;

public enum CountryCode {
	USA(1),
	Australia(61),
	China(86),
	Japan(81),
	Taiwan(886);
	
	private int code;
	
	CountryCode(int code){
		this.code=code;

	}
	
	public int getCode(){
		return code;
	}
}
