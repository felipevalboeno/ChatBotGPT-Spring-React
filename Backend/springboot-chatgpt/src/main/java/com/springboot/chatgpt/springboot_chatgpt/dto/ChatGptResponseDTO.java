package com.springboot.chatgpt.springboot_chatgpt.dto;

import java.util.List;


public record ChatGptResponseDTO(List<Choice> choices  ) {
    public static record Choice(Message message){
        public static record Message(String role, String content){

        }
    }
    
}
