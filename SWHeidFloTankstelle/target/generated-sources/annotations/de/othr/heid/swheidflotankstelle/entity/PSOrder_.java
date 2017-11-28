package de.othr.heid.swheidflotankstelle.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PSOrder.class)
public abstract class PSOrder_ extends de.othr.heid.swheidflotankstelle.entity.SingleIdEntity_ {

	public static volatile SingularAttribute<PSOrder, Double> amount;
	public static volatile SingularAttribute<PSOrder, OilCompany> oilCompany;
	public static volatile SingularAttribute<PSOrder, Long> oilCompanyOrderId;
	public static volatile SingularAttribute<PSOrder, Fuel> fuel;
	public static volatile SingularAttribute<PSOrder, Double> orderPrice;
	public static volatile SingularAttribute<PSOrder, Date> orderDate;

}

