package com.formation.parkout.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formation.parkout.entities.Username;

@RestController
@RequestMapping("/parkout")
public class ParkoutController {

    @PostMapping()
    public void createAccount(@RequestBody @Valid Username user) {
	String internalId = user.getInternalId();
	String password = user.getPassword();
	Username user1 = new Username(internalId, password);
	System.out.println(user1);
    }
}
