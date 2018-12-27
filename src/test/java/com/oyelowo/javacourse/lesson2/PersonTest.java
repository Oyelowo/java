package com.oyelowo.javacourse.lesson2;
import org.junit.Test;

import main.java.com.oyelowo.javacourse.lesson2.Person;

import static org.junit.Assert.assertEquals;

import java.beans.Transient;

public class PersonTest {
    @Test
    public void shouldReturnHelloWorld() {
        Person oyelowo = new Person();
        assertEquals("Hello World", oyelowo.helloWorld());
    }

    @test
    public void shouldReturnHelloOyelowo() {
        Person person = new Person();
        assertEquals("Hello Oyelowo", person.hello("Marcus"));
    }
}