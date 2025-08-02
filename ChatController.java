package com.chat.application.controller;

import com.chat.application.Repository.MessageRepository;
import com.chat.application.model.ChatMessage;
import com.chat.application.model.MessageEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalDateTime;

@Controller
public class ChatController {

    @Autowired
    private MessageRepository messageRepository;
    @MessageMapping("/sendMessage")
    @SendTo("/topic/message")
    public ChatMessage sendMessage(ChatMessage message){
        MessageEntity entity = new MessageEntity();
        entity.setSender(message.getSender());
        entity.setContent(message.getContent());
        entity.setTimestamp(LocalDateTime.now());

        messageRepository.save(entity);

        return message;
    }
    @GetMapping("chat")
    public String chat(){
        return "chat";
    }

}
