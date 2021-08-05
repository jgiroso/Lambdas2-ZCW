import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class PersonTest {

    @Test
    public void testGetName() {
        //given
        String expected = "Jen";
        LocalDate birthday = LocalDate.of(1992, 03, 15);
        //when
        Person person = new Person("Jen", birthday, Person.Sex.FEMALE, "jgiroso@xyz.com");
        String actual = person.getName();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName() {
        //given
        String expected = "Jen";
        //when
        Person person = new Person();
        person.setName("Jen");
        String actual = person.getName();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getBirthday() {
        //given
        LocalDate expected = LocalDate.of(1992, 03, 15);
        //when
        Person person = new Person("Jen", expected, Person.Sex.FEMALE, "jgiroso@xyz.com");
        LocalDate actual = person.getBirthday();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthday() {
        //given
        LocalDate expected = LocalDate.of(1992, 03, 15);
        //when
        Person person = new Person();
        person.setBirthday(expected);
        LocalDate actual = person.getBirthday();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getGender() {
        //given
        Person.Sex expected = Person.Sex.FEMALE;
        LocalDate birthday = LocalDate.of(1992, 03, 15);
        //when
        Person person = new Person("Jen", birthday, expected, "jgiroso@xyz.com");
        Person.Sex actual = person.getGender();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setGender() {
        //given
        Person.Sex expected = Person.Sex.FEMALE;
        //when
        Person person = new Person();
        person.setGender(expected);
        Person.Sex actual = person.getGender();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getEmailAddress() {
        //given
        String expected = "jgiroso@xyz.com";
        LocalDate birthday = LocalDate.of(1992, 03, 15);
        //when
        Person person = new Person("Jen", birthday, Person.Sex.FEMALE, "jgiroso@xyz.com");
        String actual = person.getEmailAddress();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setEmailAddress() {
        //given
        String expected = "jgiroso@xyz.com";
        //when
        Person person = new Person();
        person.setEmailAddress(expected);
        String actual = person.getEmailAddress();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAge() {
        //given
        int expected = 29;
        LocalDate birthday = LocalDate.of(1992, 03, 15);
        //when
        Person person = new Person("Jen", birthday, Person.Sex.FEMALE, "jgiroso@xyz.com");
        int actual = person.getAge();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void printPerson() {
        //given
        String expected = "Name: Jen, Birthday: 1992-03-15, Gender: FEMALE, Email Address: jgiroso@xyz.com";
        LocalDate birthday = LocalDate.of(1992, 03, 15);
        //when
        Person person = new Person("Jen", birthday, Person.Sex.FEMALE, "jgiroso@xyz.com");
        //then
        person.printPerson();
    }
}