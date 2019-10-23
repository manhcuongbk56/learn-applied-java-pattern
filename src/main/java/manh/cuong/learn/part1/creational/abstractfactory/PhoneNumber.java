package manh.cuong.learn.part1.creational.abstractfactory;

public abstract class PhoneNumber {
    private String phoneNummber;

    public abstract String getCountryCode();

    public void setPhoneNumber(String newNumber) {
        try {
            Long.parseLong(newNumber);
            phoneNumber = newNumber;
        } catch (NumberFormatException ex) {
        }
    }
}
