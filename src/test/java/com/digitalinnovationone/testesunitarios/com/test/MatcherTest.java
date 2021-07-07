package com.digitalinnovationone.testesunitarios.com.test;


import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;


import static org.junit.Assert.*;

public class MatcherTest {


//    @Test
//    public void givenBean_checkToString(){
//        Person person = new Person("Barack", "Obama");
//        String str = person.toString();
//        assertThat(person, S);
//        assertT
//    }

    @Test
    public void givenCollection_checkEmpty(){
        List<String> emptyList = new ArrayList<>();

        Assert.assertThat(emptyList, Matchers.empty());
    }

    @AfterEach
    @Test
    public void givenAnInteger_checkCreater(){
        assertThat(1, Matchers.greaterThan(0));
    }

    @Test
    public void givenString_checkNull(){
        String str = null;
        assertThat(str, Matchers.isEmptyOrNullString());
    }
}
