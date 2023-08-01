package com.trail2;

import java.util.Comparator;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
	@GetMapping("/getMobile")
	public Mobile mobiles(@RequestBody Mobile a) {
		return a;
	}

	@GetMapping(path = "/getAll")
	public List<Mobile> getAll(@RequestBody List<Mobile> a) {

		return a;
	}

	@GetMapping("/max")
	public Mobile getmax(@RequestBody List<Mobile> a) {
		Mobile max1 = a.stream().max(Comparator.comparingInt(Mobile::getPrice)).get();
		return max1;

	}

	@GetMapping("/min")
	public Mobile getmin(@RequestBody List<Mobile> a) {
		Mobile max1 = a.stream().min(Comparator.comparingInt(Mobile::getPrice)).get();
		return max1;

	}

	@GetMapping("/gb")
	public List<String> getgb(@RequestBody List<Mobile> a) {
		// List<Mobile> m = a.stream().filter(x -> x.getRam() > 6).
		List<String> m = a.stream().filter(x -> x.getRam() > 6).map(x -> x.getBrand()).toList();
		// List<String> y = m.stream().map(x -> x.getBrand()).toList();
		return m;
	}

	@GetMapping("/addPrice")
	public List<Mobile> price(@RequestBody List<Mobile> a) {
		a.forEach(y -> y.setPrice(y.getPrice() + 10000));
		return a;

	}

}
