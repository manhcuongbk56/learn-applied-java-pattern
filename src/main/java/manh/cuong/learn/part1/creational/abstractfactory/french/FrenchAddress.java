package manh.cuong.learn.part1.creational.abstractfactory.french;

import manh.cuong.learn.part1.creational.abstractfactory.Address;

public class FrenchAddress extends Address {
    private static final String COUNTRY = "FRANCE";
    public String getCountry(){
        return COUNTRY;
    }
    public String getFullAddress(){
        return getStreet() + EOL_STRING +
            getPostalCode() + SPACE + getCity() +
            EOL_STRING + COUNTRY + EOL_STRING;
    }
}
