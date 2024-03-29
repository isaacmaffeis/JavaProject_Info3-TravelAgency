package collections;

//SeaCity � figlia della classe CityObject, rappresenta una citt� al mare
//ridefinisco il metodo che stampa la guida (printGuide) dalla supercalsse
//e implemento il metodo accept dell'interfaccia Visitable
//definisco il campo guida e lo assegno tramite il visitor con la classe generateGuides 

public class SeaCity extends CityObject {

	private String guide;

	public SeaCity(String code, String name, String region, String country) {
		super(code, name, region, country);
		this.guide = accept(generateGuides);
	}

	@Override
	public <T> T accept(Visitor<T> v) {
		return v.visit(this);
	}

	@Override
	public String printGuide() {
		return guide;
	}

}
