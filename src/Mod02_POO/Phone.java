package Mod02_POO;

public class Phone {
    private PhoneType type;
    private String countryCode;
    private String regionCode;
    private String number;

    public Phone(PhoneType type, String countryCode, String regionCode, String number) {
        this.type = type;
        this.countryCode = countryCode;
        this.regionCode = regionCode;
        this.number = number;
    }

    public PhoneType getType() {
        return type;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public String getNumber() {
        return number;
    }
}
