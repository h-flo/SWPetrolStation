package de.othr.heid.swheidflotankstelle.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DeliveryNote.class)
public abstract class DeliveryNote_ extends de.othr.heid.swheidflotankstelle.entity.SingleIdEntity_ {

	public static volatile SingularAttribute<DeliveryNote, ShippingCompany> shippingCompany;
	public static volatile SingularAttribute<DeliveryNote, Double> amount;
	public static volatile SingularAttribute<DeliveryNote, Fuel> fuel;
	public static volatile SingularAttribute<DeliveryNote, Date> deliveryDate;

}

