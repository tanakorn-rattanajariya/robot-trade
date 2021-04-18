package com.snowball.stock.cron;

import java.util.TimerTask;

import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BaseCron extends TimerTask {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		final String uri = "https://api.bitkub.com/api/market/ticker?sym=THB_BTC";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		log.info(result);
	}
	
}
