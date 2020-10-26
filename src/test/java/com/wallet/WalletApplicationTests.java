package com.wallet;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

// Usar o profile de teste criado no application-test.properties
@ExtendWith(SpringExtension.class)
@SpringBootTest
@ActiveProfiles("test")
class WalletApplicationTests {

	@Test
	void contextLoads() {
	}

}