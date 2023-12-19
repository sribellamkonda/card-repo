package com.example.card.controller

import org.junit.Before
import org.junit.Test

class WebControllerTest {

	def webController
	@Before
	void setup() {
		webController = new WebController()
	}
	@Test
	void 'should return Hello World'(){
		assert webController.salutation()=="Hello world!"
	}
	
}