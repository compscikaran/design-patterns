package com.langchain;

import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.service.AiServices;

public class SampleAgent {

    public static void main(String[] args) {
        String apiKey = System.getenv("OPENAI_API_KEY");
        OpenAiChatModel model = OpenAiChatModel.withApiKey(apiKey);

        Agent agent = AiServices.builder(Agent.class)
                .chatLanguageModel(model)
                .systemMessageProvider(chatMemoryId -> Constants.PROMPT)
                .build();

        System.out.println(agent.chat("Hi There"));
    }
}
