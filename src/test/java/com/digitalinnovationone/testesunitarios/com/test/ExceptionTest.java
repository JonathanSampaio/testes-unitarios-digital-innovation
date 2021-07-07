package com.digitalinnovationone.testesunitarios.com.test;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.internal.runners.statements.ExpectException;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.fail;

public class ExceptionTest {


    @Test (expected = IndexOutOfBoundsException.class)
    public void empty() {
        List<String> list =  new ArrayList<String>();

        list.get(0);

    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();


    @Test
    public void ahouldTestExceptionMessage() throws  IndexOutOfBoundsException {
        List<Object> list = new ArrayList<Object>();

        thrown.expect(IndexOutOfBoundsException.class);
        thrown.expectMessage("Index: 0, Size: 0");
        list.get(0);
    }


//    @Test
//    public void testExceptionMessage() {
//        try {
//            new ArrayList<Object>().get(0);
//            fail("Esperado que  IndexOutOfBoundeException seja lançada");
//        } catch (IndexOutOfBoundsException ex) {
//            Assert.assertThat(ex.getMessage(), is("index: 0, Size: 0"));
//        }
//    }

}


