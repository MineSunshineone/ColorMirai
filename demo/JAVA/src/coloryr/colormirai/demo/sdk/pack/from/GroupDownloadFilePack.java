package coloryr.colormirai.demo.sdk.pack.from;

import coloryr.colormirai.demo.sdk.pack.PackBase;

/**
 * 107 [插件]下载群文件到指定位置
 */
public class GroupDownloadFilePack extends PackBase {
    /**
     * 群号
     */
    public long id;
    /**
     * 文件ID
     */
    public String fid;
    /**
     * 下载到的路径
     */
    public String dir;
}
