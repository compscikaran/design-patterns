package com.langchain;

import dev.langchain4j.service.UserMessage;

public interface PriorityAnalyzer{

    @UserMessage("Analyze the priority of the following issue: {{it}}")
    Priority analyzePriority(String issueDescription);
}
