

//2nd part


package com.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.demo.main.Junit_demo1;

public class TestEvenOROdd {
@Test
public void Even() {
	assertEquals(true,findEvenOdd.EvenOdd (8));
	assertEquals(false,findEvenOdd.EvenOdd(19));
}}