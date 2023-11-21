package org.kumar.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMainProgram {

	/**
	 * This Test is for the Main Program Component for getMessage Functiinality
	 * 
	 * */
	@Test
	void testgetMesasge() {
		// Arrange
		MainProgram sut = new MainProgram();
		String expected = "Helllo Automation";
		// Act
		String actual = sut.getMessage();
		// Assert
		assertEquals(expected, actual);
	}

}
