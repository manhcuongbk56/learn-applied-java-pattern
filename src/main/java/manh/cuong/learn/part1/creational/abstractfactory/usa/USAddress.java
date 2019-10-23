package manh.cuong.learn.part1.creational.abstractfactory.usa;

import manh.cuong.learn.part1.creational.abstractfactory.Address;

public class USAddress extends Address {
    private static final String COUNTRY = "UNITED STATES";
    private static final String COMMA = ",";

    public String getCountry(){
        return COUNTRY;
    }

    public String getFullAddress(){
        return getStreet() + EOL_STRING +
            getCountry() + COMMA + SPACE + getRegion() +
            SPACE + getPostalCode() + EOL_STRING +
            COUNTRY + EOL_STRING;
    }
}
