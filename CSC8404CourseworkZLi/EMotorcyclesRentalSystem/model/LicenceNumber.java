package EMotorcyclesRentalSystem.model;
import java.util.Calendar;

public class LicenceNumber {
    private static int serialNumber = 1;
    private final String initials;
    private final int yearOfIssue;
    private final int uniqueNumber;

    public LicenceNumber(String initials, int yearOfIssue, int uniqueNumber) {
        this.initials = initials;
        this.yearOfIssue = yearOfIssue;
        this.uniqueNumber = uniqueNumber;
    }

    public static LicenceNumber generateLicenceNumber(String firstName, String lastName, int yearOfIssue) {
        String initials = String.valueOf(firstName.charAt(0)) + String.valueOf(lastName.charAt(0));
        return new LicenceNumber(initials, yearOfIssue, serialNumber++);
    }

    public static LicenceNumber generateLicenceNumber(String firstName, String lastName) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return generateLicenceNumber(firstName, lastName, currentYear);
    }

    @Override
    public String toString() {
        return initials + "-" + yearOfIssue + "-" + uniqueNumber;
    }

    public String getInitials() {
        return initials;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public int getUniqueSerialNumber() {
        return uniqueNumber;
    }
}
