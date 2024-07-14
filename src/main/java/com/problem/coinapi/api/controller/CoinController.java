package com.problem.coinapi.api.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoinController {

	@GetMapping("/coin")
	public List<Number> getCoinList(@RequestParam Double amt, @RequestParam List<Number> denoms) {
		List<Number> coinList = new ArrayList<>();

		Collections.sort(denoms, Collections.reverseOrder());
		System.out.println(denoms);

		for (Number denom : denoms) {
			double denomDouble = denom.doubleValue();
			while (amt >= denomDouble) {
				amt -= denomDouble;
				amt = Math.round(amt * 100.0) / 100.0;
				coinList.add(denom);
				System.out.println(denom + " " + amt);
			}
		}
		Collections.sort(coinList, (a, b) -> Double.compare(a.doubleValue(), b.doubleValue()));
		return coinList;
	}

}
