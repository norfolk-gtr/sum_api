package org.pribautkin.sumapi;

import org.junit.jupiter.api.Test;
import org.pribautkin.sumapi.controller.dto.SumFloatDto;
import org.pribautkin.sumapi.service.result.SumResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SumControllerTests {

	@LocalServerPort
	private int port;
	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void dummyTest() {
		HttpEntity<SumFloatDto> entity = new HttpEntity<>(new SumFloatDto(1f,2f), new HttpHeaders());
		SumResult response = restTemplate.postForObject("http://localhost:" + port + "/api/sum", entity, SumResult.class);
		assertEquals(3f, response.getResult());
	}

	@Test
	void firstNumNullTest() {
		HttpEntity<SumFloatDto> entity = new HttpEntity<>(new SumFloatDto(null,2f), new HttpHeaders());
		SumResult response = restTemplate.postForObject("http://localhost:" + port + "/api/sum", entity, SumResult.class);
		assertNull(response.getResult());
	}

	@Test
	void secondNumNullTest() {
		HttpEntity<SumFloatDto> entity = new HttpEntity<>(new SumFloatDto(1f,null), new HttpHeaders());
		SumResult response = restTemplate.postForObject("http://localhost:" + port + "/api/sum", entity, SumResult.class);
		assertNull(response.getResult());
	}

	@Test
	void bothNumsNullTest() {
		HttpEntity<SumFloatDto> entity = new HttpEntity<>(new SumFloatDto(null,null), new HttpHeaders());
		SumResult response = restTemplate.postForObject("http://localhost:" + port + "/api/sum", entity, SumResult.class);
		assertNull(response.getResult());
	}

}
