package jpabook.jpashop.domain;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class Address {

    private String city;
    private String street;
    private String zipcodes;



    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getZipcodes() {
        return zipcodes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(city, address.city) && Objects.equals(street, address.street) && Objects.equals(zipcodes, address.zipcodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, zipcodes);
    }
}
