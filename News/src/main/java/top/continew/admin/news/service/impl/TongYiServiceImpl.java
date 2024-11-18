package top.continew.admin.news.service.impl;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.continew.admin.news.service.TongYiService;

import java.util.Map;


@Service
public class TongYiServiceImpl implements TongYiService {

    /**
     * 自动注入ChatClient、imageClient、StreamingChatClient，屏蔽模型调用细节
     */
    private final ChatClient chatClient;

//    private final ImageClient imageClient;
//
//    private final StreamingChatClient streamingChatClient;

//    @Autowired
//    public TongYiServiceImpl(ChatClient chatClient) {
//        this.chatClient = chatClient;
////        this.imageClient = imageClient;
////        this.streamingChatClient = streamingChatClient;
//    }
    @Autowired
    public TongYiServiceImpl(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }


    @Override
    public String completion(String message) {
        return null;
    }

    @Override
    public String genAudio(String text) {
        return null;
    }

    @Override
    public Map<String, String> streamCompletion(String message) {
        return null;
    }
}
