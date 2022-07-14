package ru.yandex.praktikum.adult;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProgramTest {

    @Test
    public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);
        boolean expected = true;
        assertEquals("Person is not an adult", expected, isAdult);
    }

    @Test
    public void checkIsAdultWhenAgeIsLessThan18False() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(17);
        boolean expected = false;
        assertEquals("Person is an adult", expected, isAdult);
    }

    @Test
    public void checkIsAdultWhenAgeIs18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(18);
        boolean expected = true;
        assertEquals("Person is not an adult", expected, isAdult);
    }
}