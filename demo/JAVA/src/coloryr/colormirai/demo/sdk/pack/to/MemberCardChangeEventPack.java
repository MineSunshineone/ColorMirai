package coloryr.colormirai.demo.sdk.pack.to;

import coloryr.colormirai.demo.sdk.pack.PackBase;

/**
 * 34 [机器人]成员群名片改动（事件）
 */
public class MemberCardChangeEventPack extends PackBase {
    /**
     * 群号
     */
    public long id;
    /**
     * 执行人QQ号
     */
    public long fid;
    /**
     * 旧的状态
     */
    public String old;
    /**
     * 新的状态
     */
    public String now;
}
