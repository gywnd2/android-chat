package com.udangtangtang.shockshak.domain;

import lombok.Data;

@Data
public class ChatMessage {

    private String senderSessionId;
    private String message;
    private MessageType messageType;
}
