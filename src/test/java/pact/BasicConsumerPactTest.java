package pact;

import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.loader.PactBroker;
import au.com.dius.pact.provider.junit5.HttpTestTarget;
import au.com.dius.pact.provider.junit5.PactVerificationContext;
import au.com.dius.pact.provider.junit5.PactVerificationInvocationContextProvider;
import com.example.basic.BasicProviderApplication;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = BasicProviderApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT,
        properties = {"server.port=8082"})
@Provider("BasicProvider")
@PactBroker(host = "localhost", port = "800")
public class BasicConsumerPactTest {

    @BeforeEach
    public void setupTestTarget(PactVerificationContext context) {
        System.setProperty("pact.verifier.publishResults", "true");
        context.setTarget(new HttpTestTarget("localhost", 8082, "/"));
    }

    @TestTemplate
    @ExtendWith(PactVerificationInvocationContextProvider.class)
    public void pactVerificationTestTemplate(PactVerificationContext context) {
        context.verifyInteraction();
    }
}
