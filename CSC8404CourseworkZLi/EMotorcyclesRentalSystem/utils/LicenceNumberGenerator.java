package EMotorcyclesRentalSystem.utils;

import EMotorcyclesRentalSystem.model.DrivingLicence;
import EMotorcyclesRentalSystem.model.Person;

import java.util.HashSet;
import java.util.Set;

public class LicenceNumberGenerator {

    private static final Set<String> existingLicenceNumbers = new HashSet<>();

    public static String generateLicenceNumber(Person person, int yearOfIssue) {
        String initials = person.getFirstName().substring(0, 1) + person.getLastName().substring(0, 1);
        String year = String.valueOf(yearOfIssue);
        int serialNumber = 1;
        String licenceNumber;
        
        do {
            licenceNumber = initials + "-" + year + "-" + serialNumber;
            serialNumber++;
        } while (existingLicenceNumbers.contains(licenceNumber));

        existingLicenceNumbers.add(licenceNumber);
        return licenceNumber;
    }
}
