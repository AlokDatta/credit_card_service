package com.app.card.controller;

import java.util.List;

import com.app.card.service.CreditCardService;
import com.app.card.dto.CreditCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * All requests to root directory will be routed by this controller.
 *
 * @author Aloknath Datta
 */
@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
public class CreditCardController {
	
	@Autowired
	private CreditCardService creditCardManagementService;

	@GetMapping("/creditCards/getAll")
	public List<CreditCard> getAllCreditCards() {
		return creditCardManagementService.findAll();
	}
	
	@PostMapping("/creditCards/add")
	public ResponseEntity<?> createCreditCard(@RequestBody CreditCard creditCard) {
		if (creditCard.checkLuhn10()) {
			try {
				creditCardManagementService.addCreditCard(creditCard);
				return new ResponseEntity<Object>(HttpStatus.OK);
			} catch (DuplicateKeyException e) {
				return new ResponseEntity<Error>(HttpStatus.CONFLICT);
			}
		}
		return new ResponseEntity<Error>(HttpStatus.FORBIDDEN);
	}

}