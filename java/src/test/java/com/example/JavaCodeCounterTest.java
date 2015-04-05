package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

public class JavaCodeCounterTest {

    private JavaCodeCounter javaCodeCounter;

    @Before
    public void setup() {
        javaCodeCounter = new JavaCodeCounter();
    }

    @Test
    public void should_create_system_under_test() {
        assertThat(javaCodeCounter, is(notNullValue()));
    }

    /**
     * Scenario 1:
     *  A line contains only whitespace **_should not be_** counted as a Java line of code.
     */

    @Test
    public void null_source_input_should_not_result_in_any_counted_lines(){
        assertThat(javaCodeCounter.count(null), is(equalTo(0)));
    }

    @Test
    public void empty_source_input_should_not_result_in_any_counted_lines(){
        assertThat(javaCodeCounter.count(""), is(equalTo(0)));
    }

    @Test
    public void lines_that_contain_spaces_only_should_not_be_counted(){
        assertThat(javaCodeCounter.count("  "), is(equalTo(0)));
    }

    @Test
    public void lines_that_contain_tabs_only_should_not_be_counted(){
        assertThat(javaCodeCounter.count("\t\t\t\t\t\t"), is(equalTo(0)));
    }

    @Test
    public void lines_that_contain_carriage_return_only_should_not_be_counted(){
        assertThat(javaCodeCounter.count("\n"), is(equalTo(0)));
    }

    @Test
    public void lines_that_contain_carriage_return_and_line_feeds_only_should_not_be_counted(){
        assertThat(javaCodeCounter.count("\n" + System.getProperty("line.separator")), is(equalTo(0)));
    }

}