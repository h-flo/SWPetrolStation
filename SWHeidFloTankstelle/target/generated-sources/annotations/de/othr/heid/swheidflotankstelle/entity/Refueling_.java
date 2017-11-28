package de.othr.heid.swheidflotankstelle.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Refueling.class)
public abstract class Refueling_ extends de.othr.heid.swheidflotankstelle.entity.SingleIdEntity_ {

	public static volatile SingularAttribute<Refueling, Double> amount;
	public static volatile SingularAttribute<Refueling, Double> sumPrice;
	public static volatile SingularAttribute<Refueling, Fuel> fuel;
	public static volatile SingularAttribute<Refueling, Double> pricePerLiter;

}

