package tudelft.LeeChu;

public class LeeChu {
    public String getFullName() {
        return "Lee Chu";
    }

    public String getFirstName() {
        return "Lee";
    }

    public String getLastName() {
        return "Chu";
    }

    public String getUCInetID() {
        return "lwchu";
    }

    public String getStudentNumber() {
        return "51741446";
    }

    public String getRotatedFullName(int shift) {
        String fullName = "Lee Chu";
        if (shift < 0) {
            shift = fullName.length() + shift;
        }
        fullName = fullName.substring(shift) + fullName.substring(0, shift);
        return fullName;
    }
}
