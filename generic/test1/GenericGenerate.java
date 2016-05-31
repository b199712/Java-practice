package generic.test1;

public class GenericGenerate implements GenericInterface<String> {

	private String value;
	
	@Override
	public void setValue(String value) {
		// TODO Auto-generated method stub
		this.value=value;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return value;
	}

}
