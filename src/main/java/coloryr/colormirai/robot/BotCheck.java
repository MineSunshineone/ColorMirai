package coloryr.colormirai.robot;

import coloryr.colormirai.ColorMiraiMain;
import coloryr.colormirai.Msg;
import coloryr.colormirai.plugin.ThePlugin;
import net.mamoe.mirai.Bot;
import net.mamoe.mirai.contact.Friend;
import net.mamoe.mirai.contact.Group;
import net.mamoe.mirai.contact.NormalMember;
import net.mamoe.mirai.contact.friendgroup.FriendGroup;

public class BotCheck {
    public static Bot qq(ThePlugin plugin, long qq) {
        return qq(plugin, "", qq);
    }

    public static Bot qq(ThePlugin plugin, String uuid, long qq) {
        Bot bot = BotStart.getBots().get(qq);
        if (bot == null) {
            String temp = Msg.non_existent + Msg.qq(qq);
            ColorMiraiMain.logger.warn(temp);
            plugin.sendPluginMessage(qq, uuid, temp);
            return null;
        }

        return bot;
    }

    public static FriendGroup friendGroup(ThePlugin plugin, Bot bot, int id) {
        return friendGroup(plugin, bot, id, "");
    }

    public static FriendGroup friendGroup(ThePlugin plugin, Bot bot, int id, String uuid) {
        FriendGroup group = bot.getFriendGroups().get(id);
        if (group == null) {
            String temp = Msg.qq(bot.getId()) + Msg.non_existent + Msg.friend_group(id);
            ColorMiraiMain.logger.warn(temp);
            plugin.sendPluginMessage(bot.getId(), uuid, temp);
            return null;
        }

        return group;
    }

    public static Friend friend(ThePlugin plugin, Bot bot, long id, String uuid) {
        Friend friend = bot.getFriend(id);
        if (friend == null) {
            String temp = Msg.qq(bot.getId()) + Msg.non_existent + Msg.friend(id);
            ColorMiraiMain.logger.warn(temp);
            plugin.sendPluginMessage(bot.getId(), uuid, temp);
            return null;
        }
        return friend;
    }

    public static Group group(ThePlugin plugin, Bot bot, long id, String uuid) {
        Group group = bot.getGroup(id);
        if (group == null) {
            String temp = Msg.qq(bot.getId()) + Msg.non_existent + Msg.group(id);
            ColorMiraiMain.logger.warn(temp);
            plugin.sendPluginMessage(bot.getId(), uuid, temp);
            return null;
        }
        return group;
    }

    public static NormalMember member(ThePlugin plugin, Bot bot, Group group, long id, String uuid) {
        NormalMember member = group.get(id);
        if (member == null) {
            String temp = Msg.qq(bot.getId()) + Msg.group(group.getId()) + Msg.non_existent + Msg.member(id);
            ColorMiraiMain.logger.warn(temp);
            plugin.sendPluginMessage(bot.getId(), uuid, temp);
            return null;
        }
        return member;
    }
}
