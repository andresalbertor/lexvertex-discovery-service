package com.lexvertex.discovery;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Smoke test del contexto Eureka Server.
 *
 * @author andresalbertor@yahoo.com
 * @version 1.0
 * @since 2026-11-14
 */
@SpringBootTest
class DiscoveryServiceApplicationTest {

    @Test
    @DisplayName("El contexto de Spring Boot carga correctamente")
    void contextLoads() {
        // Eureka server standalone con register/fetch deshabilitados en application.yml
    }
}
