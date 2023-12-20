package com.example.card.controller
import org.springframework.http.HttpStatus

import org.junit.Before
import org.junit.Test
import org.springframework.http.ResponseEntity
import org.springframework.test.*
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

import com.example.card.model.CardInfo

import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

class CardServiceControllerTest {

	def cardServiceController   //declare variable
	def cardInfo
	@Before
	void setup() {
		cardServiceController = new CardServiceController()  //initialization of variable
		cardInfo= new CardInfo()
		
		
	}
	//Test method
	@Test
	void 'should return a list of strings'(){
		List l=List.of("340000000000012", "6011000000001111", "2221000000000000",
			"4026000000000000")
		assert cardServiceController.getCards()==new ResponseEntity<>(l, HttpStatus.OK)
	}

		
		@Test
		void 'list of mc details'(){
			List list=List.of("2221000000000000", "2720000000000001")	
			assert cardServiceController.getCards('mc')==new ResponseEntity<>(list, HttpStatus.OK)
		}
		
		@Test
		void 'bad Request for non mc'(){
			List list=List.of("Invalid Brand")
			assert cardServiceController.getCards('visa')==new ResponseEntity<>(list, HttpStatus.BAD_REQUEST)
		}
		
		@Test
		void 'save card details'(){
			cardInfo.setNumber('123456789123456')
			cardInfo.setFirstName('sbell')
			cardInfo.setLastName('bellamko')
			cardInfo.setBillingAddress('ring')
			ResponseEntity<String> resp = cardServiceController.save(cardInfo)
			assert resp.statusCode==HttpStatus.CREATED
		}
		
	}