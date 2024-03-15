package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "https://api.pulze.ai";
        
        // Configure HTTP bearer authorization: HTTPBearer
        configuration.token = "BEARER TOKEN";
        PulzeAi client = new PulzeAi(configuration);
        assertNotNull(client);
    }
}
