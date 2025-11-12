package com.springboot.chatgpt.springboot_chatgpt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import com.springboot.chatgpt.springboot_chatgpt.dto.ChatGptRequestDTO;
import com.springboot.chatgpt.springboot_chatgpt.dto.ChatGptResponseDTO;
import com.springboot.chatgpt.springboot_chatgpt.dto.PromptRequestDTO;

@Service
public class ChatGptService {

    private final RestClient restClient;

    @Autowired
    public ChatGptService(RestClient restClient){
        this.restClient = restClient;
    }

    @Value("${openapi.api.key}")
    private String apiKey;

    @Value("${openapi.api.model}")
    private String model;
    
    public String getChatResponse(PromptRequestDTO promptRequestDTO){

        ChatGptRequestDTO chatGptRequestDTO = new ChatGptRequestDTO(
            model, 
            List.of(new ChatGptRequestDTO.Message("user", promptRequestDTO.prompt()))
        );

        ChatGptResponseDTO response = restClient.post()
                .header("Authorization", "Bearer " + apiKey)
                .header("Content-Type", "application/json")
                .body(chatGptRequestDTO)
                .retrieve()
                .body(ChatGptResponseDTO.class);

        return response.choices().get(0).message().content();


    }
}
