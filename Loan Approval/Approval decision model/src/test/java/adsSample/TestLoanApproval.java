package adsSamples;

import com.ibm.decision.run.test.junit5.DecisionTest;
import com.ibm.decision.run.test.junit5.JSONTestDirectoryFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.TestFactory;

import java.util.Date;
import java.util.logging.*;
import java.util.stream.Stream;

@DecisionTest(decisionOperation = "ApprovalDecisionModel-Approval-decision-model")
@DisplayName("LoanApproval")
public class TestLoanApproval {
    @TestFactory
    public Stream<DynamicNode> decisionTests() {
        Logger logger = Logger.getLogger("com.ibm.decision.run.test");
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        logger.addHandler(handler);
        logger.setLevel(Level.FINEST);

        return JSONTestDirectoryFactory.createTests(this.getClass());
    }
}