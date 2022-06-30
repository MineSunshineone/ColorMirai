package coloryr.colormirai.demo.sdk.pack.to;

import coloryr.colormirai.demo.sdk.pack.PackBase;

/**
 * 10 [机器人]主动离线（事件）
 * 12 [机器人]被服务器断开（事件）
 * 13 [机器人]因网络问题而掉线（事件）
 */
public class BotOfflineEventAPack extends PackBase {
    /**
     * 离线原因
     */
    public String message;
}
