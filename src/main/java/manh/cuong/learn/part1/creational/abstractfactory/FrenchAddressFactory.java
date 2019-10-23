package manh.cuong.learn.part1.creational.abstractfactory;

import manh.cuong.learn.part1.creational.abstractfactory.french.FrenchAddress;
import manh.cuong.learn.part1.creational.abstractfactory.french.FrenchPhoneNumber;

public class FrenchAddressFactory implements AddressFactory {
    @Override
    public Address createAddress() {
        return new FrenchAddress();
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return new FrenchPhoneNumber();
    }
}
