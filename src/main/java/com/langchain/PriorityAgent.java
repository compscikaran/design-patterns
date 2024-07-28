package com.langchain;

import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.service.AiServices;

public class PriorityAgent {

    public static void main(String[] args) {
        String apiKey = System.getenv("OPENAI_API_KEY");
        OpenAiChatModel model = OpenAiChatModel.withApiKey(apiKey);

        PriorityAnalyzer agent = AiServices.builder(PriorityAnalyzer.class)
                .chatLanguageModel(model)
                .build();

        System.out.println(agent.analyzePriority("The main payment gateway is down, and customers cannot process transactions."));
    }
}
