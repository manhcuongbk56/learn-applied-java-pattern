package manh.cuong.learn.part1.creational.abstractfactory;

import manh.cuong.learn.part1.creational.abstractfactory.usa.USAddress;
import manh.cuong.learn.part1.creational.abstractfactory.usa.USPhoneNumber;

public class USAddressFactory implements AddressFactory {
    @Override
    public Address createAddress() {
        return new USAddress();
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return new USPhoneNumber();
    }
}
