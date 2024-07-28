package com.langchain;

import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.service.AiServices;

public class ToolAgent {

    public static void main(String[] args) {
        String apiKey = System.getenv("OPENAI_API_KEY");
        OpenAiChatModel model = OpenAiChatModel.builder()
                .modelName("gpt-4o-mini")
                .apiKey(apiKey)
                .build();

        Agent agent = AiServices.builder(Agent.class)
                .chatLanguageModel(model)
                .systemMessageProvider(chatMemoryId -> Constants.PROMPT2)
                .tools(new Calculator())
                .build();
        long start = System.currentTimeMillis();
        System.out.println(agent.chat("What is the factorial of 5"));
        long end = System.currentTimeMillis();
        System.out.println("Time taken: " + ((end - start)/1000));
    }
}
