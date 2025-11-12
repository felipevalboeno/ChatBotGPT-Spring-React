package com.springboot.chatgpt.springboot_chatgpt.dto;

import java.util.List;



public record ChatGptRequestDTO(String model, List<Message> messages) {
    
    public static record Message (String role, String content){

    }

   
}
