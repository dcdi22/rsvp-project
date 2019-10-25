package com.company.rsvpedge.controller;

import com.company.rsvpedge.models.Rsvp;
import com.company.rsvpedge.service.RsvpService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = RsvpController.class)
class RsvpControllerTest {
	@Autowired
	MockMvc mockMvc;

	@Autowired
	ObjectMapper objectMapper;

	@MockBean
	RsvpService rsvpService;

	@Test
	void provided_valid_data_it_can_persist_rsvp() throws Exception {
		Rsvp rsvp = new Rsvp();
		String inputJson = objectMapper.writeValueAsString(rsvp);

		Rsvp rsvp2 = new Rsvp();
		String outputJson = objectMapper.writeValueAsString(rsvp2);

		when(rsvpService.create(rsvp)).thenReturn(rsvp2);

		mockMvc.perform(
			post("/rsvp").contentType(MediaType.APPLICATION_JSON).contentType(inputJson)
		).andExpect(status().isCreated()).andExpect(content().json(outputJson));
	}
}