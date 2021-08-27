package com.calcdistance.distance.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.calcdistance.distance.models.Location;
import com.calcdistance.distance.services.DistanceService;

@RestController
public class BuisinessController {
	@Autowired
	private DistanceService ds;
	@RequestMapping(method = RequestMethod.POST,value = "/get/businesses")
	public ResponseEntity<?> getBuisisnessList(@RequestBody Location l)
	{
		return ResponseEntity.ok(ds.getBusinesses(l));
	}
}
