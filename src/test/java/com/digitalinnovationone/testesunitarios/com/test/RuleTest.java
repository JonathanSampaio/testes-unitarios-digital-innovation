package com.digitalinnovationone.testesunitarios.com.test;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

public class RuleTest {

    @Rule
    public TemporaryFolder tmpFolder = new TemporaryFolder();

    @Test
    public void ahouldCreateNewFileInTemporaryFolder() throws IOException{
        File created = tmpFolder.newFile("file.txt");

        Assert.assertTrue(created.isFile());
        Assert.assertEquals(tmpFolder.getRoot(), created.getParentFile());
    }

}
