package smartphone_manufacturing.supply_chain_ontology.concepts.smartPhoneComponents;

import java.util.Objects;

/*
 * Small battery component for small phone: 2000mAh mandatory
 * */

public class SmallBattery extends Battery {
	private static final long serialVersionUID =1L;
	
	@Override
	public String toString() {
		return "Small phone battery: 2000mAh";
	}
	
	@Override
	  public int hashCode() {
	    return Objects.hash(this.toString());
	  }

}
