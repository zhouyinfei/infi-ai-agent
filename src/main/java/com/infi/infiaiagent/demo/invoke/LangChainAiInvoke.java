package com.infi.infiaiagent.demo.invoke;

import dev.langchain4j.community.model.dashscope.QwenChatModel;
import dev.langchain4j.model.chat.ChatLanguageModel;

public class LangChainAiInvoke {

    public static void main(String[] args) {
        ChatLanguageModel qwenModel = QwenChatModel.builder()
                .baseUrl("https://ws-pl6el2kmifl7zzb2.cn-beijing.maas.aliyuncs.com/compatible-mode/v1")
                .apiKey(TestApiKey.API_KEY)
                .modelName("qwen3.8-max")
                .build();
        String answer = qwenModel.chat("我是程序员infi");
        System.out.println(answer);
    }
}
