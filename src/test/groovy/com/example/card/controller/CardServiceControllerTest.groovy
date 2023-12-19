package com.example.card.controller
import org.springframework.http.HttpStatus

import org.junit.Before
import org.junit.Test
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

import com.example.card.model.CardInfo

import jakarta.validation.Valid

class CardServiceControllerTest {
	
		def cardServiceController   //declare variable
		@Before
		void setup() {
			cardServiceController = new CardServiceController()  //initialization of variable
			
		}
		//Test method 
		@Test  
		void 'should return a list of strings'(){
			List l=List.of("340000000000012", "6011000000001111", "2221000000000000",
				"4026000000000000")
			assert cardServiceController.getCards()==new ResponseEntity<>(l, HttpStatus.OK)
		}
		
		
		//@Test
		//void 'should return a list of string'(){
		//	List l=List.of(List.of("2221000000000000", "2720000000000001")
		//	assert cardServiceController.getCards()==new ResponseEntity<>(l, HttpStatus.OK)
		//}
		
		
		//@Test
		//void 'should save list of string'(){
		//	assert cardServiceController.save()==new ResponseEntity<>(UUID.randomUUID().toString(), HttpStatus.CREATED)
		//}
		
		
	}