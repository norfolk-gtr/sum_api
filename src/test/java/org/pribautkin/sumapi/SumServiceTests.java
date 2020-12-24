package org.pribautkin.sumapi;

import org.junit.jupiter.api.Test;
import org.pribautkin.sumapi.controller.dto.SumFloatDto;
import org.pribautkin.sumapi.service.SumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


@SpringBootTest
class SumServiceTests {

	@Autowired
	private SumService sumService;

	@Test
	void dummyTest() {
		assertEquals(sumService.sum(new SumFloatDto(1f,2f)).getResult(),3f);
	}

	@Test
	void firstNumNullTest() {
		assertThrows(RuntimeException.class, () -> sumService.sum(new SumFloatDto(null,2f)));
	}

	@Test
	void secondNumNullTest() {
		assertThrows(RuntimeException.class, () -> sumService.sum(new SumFloatDto(1f,null)));
	}

	@Test
	void bothNumsNullTest() {
		assertThrows(RuntimeException.class, () -> sumService.sum(new SumFloatDto(null,null)));
	}
}
