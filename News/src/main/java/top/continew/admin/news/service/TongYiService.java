package top.continew.admin.news.service;

import java.util.Map;

public interface TongYiService {

    /**
     * 基本问答
     */
    String completion(String message);

    /**
     * 文生图
     */
//    ResponseEntity<byte[]> genImg(String imgPrompt);

    /**
     * 语音合成
     */
    String genAudio(String text);

    /**
     * 流式回答
     * @param message
     * @return
     */
    Map<String, String> streamCompletion(String message);

}

