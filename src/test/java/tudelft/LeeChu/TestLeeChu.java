package tudelft.LeeChu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tudelft.gettingstarted.GettingStarted;

public class TestLeeChu {

    @Test
    public void fullName() {
        LeeChu myName = new LeeChu();
        String fullName = myName.getFullName();
        Assertions.assertEquals("Lee Chu", fullName);
    }


    @Test
    public void firstName() {
        LeeChu myName = new LeeChu();
        String firstName = myName.getFirstName();
        Assertions.assertEquals("Lee", firstName);
    }

    @Test
    public void lastName() {
        LeeChu myName = new LeeChu();
        String lastName = myName.getLastName();
        Assertions.assertEquals("Chu", lastName);
    }

    @Test
    public void UCINetID() {
        LeeChu myName = new LeeChu();
        String UCInetID = myName.getUCInetID();
        Assertions.assertEquals("lwchu", UCInetID);
    }

    @Test
    public void StudentNumber() {
        LeeChu myName = new LeeChu();
        String StudentNumber = myName.getStudentNumber();
        Assertions.assertEquals("51741446", StudentNumber);
    }

    @Test
    public void rotatedPositive() {
        LeeChu myName = new LeeChu();
        String rotate = myName.getRotatedFullName(2);
        Assertions.assertEquals("e ChuLe", rotate);
    }

    @Test
    public void rotatedNegative() {
        LeeChu myName = new LeeChu();
        String rotate = myName.getRotatedFullName(-3);
        Assertions.assertEquals("ChuLee ", rotate);
    }
}
