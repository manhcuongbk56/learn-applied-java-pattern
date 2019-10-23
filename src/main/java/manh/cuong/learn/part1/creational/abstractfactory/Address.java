package manh.cuong.learn.part1.creational.abstractfactory;

import lombok.Data;

@Data
public abstract class Address {
    private String street;
    private String city;
    private String region;
    private String postalCode;

    public static final String EOL_STRING = System.getProperty("line.separator");
    public static final String SPACE = " ";
}
