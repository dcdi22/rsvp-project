package com.company.rsvpedge.controller;

import com.company.rsvpedge.models.Rsvp;
import com.company.rsvpedge.service.RsvpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/rsvp")
public class RsvpController {
	@Autowired
	RsvpService rsvpService;

	@PostMapping()
	public Rsvp create(@RequestBody @Valid Rsvp rsvp) {
		return null;
	}
}
