package coloryr.colormirai.demo.RobotSDK.pack.to;

import coloryr.colormirai.demo.RobotSDK.pack.PackBase;

/*
113 [机器人]群解散消息（事件）
id:群号
 */
public class GroupDisbandPack extends PackBase {
    public long id;

    public GroupDisbandPack(long qq, long id) {
        this.qq = qq;
        this.id = id;
    }
}
