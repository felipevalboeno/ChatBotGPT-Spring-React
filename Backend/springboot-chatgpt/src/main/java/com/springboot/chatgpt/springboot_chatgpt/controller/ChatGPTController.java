package com.springboot.chatgpt.springboot_chatgpt.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.chatgpt.springboot_chatgpt.dto.PromptRequestDTO;
import com.springboot.chatgpt.springboot_chatgpt.service.ChatGptService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/chat")
public class ChatGPTController {

    private final ChatGptService chatGptService;

    public ChatGPTController(ChatGptService chatGptService){
        this.chatGptService = chatGptService;
    }

    @PostMapping
    public String chat(@RequestBody PromptRequestDTO promptRequestDTO){
        return chatGptService.getChatResponse(promptRequestDTO);
    }
}
