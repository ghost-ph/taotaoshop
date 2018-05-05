package com.taotao.test;

import com.taotao.commom.utils.FtpUtil;
import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

/**
 * Created by luxiaoxiao on 2018/4/19
 */
public class FTPTest {
    @Test
    public void testFtp() throws Exception{
        //创建FTPClient对象
        //1.连接ftp服务器
        FTPClient ftpClient=new FTPClient();
        ftpClient.connect("10.60.62.248",2121);
        //2.登录ftp服务器
        ftpClient.login("ftp","863434");
        FileInputStream inputStream=new FileInputStream(new File("D:\\test\\1.jpg"));

        //4.上传文件
        //1)指定上传目录
        ftpClient.changeWorkingDirectory("/aworkhome/taotao/ftpuser/images");
        //指定文件类型：文本 转换为 二进制
        ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
        //第一个参数：文件在远程服务器的名称
        //第二个参数：上传文件的文件流
        ftpClient.storeFile("hello1.jpg",inputStream);
        //5.退出登录
        ftpClient.logout();
    }
    @Test
    public void testFtpUtil() throws Exception {
        FileInputStream inputStream = new FileInputStream(new File("D:\\test\\2.jpg"));
        FtpUtil.uploadFile("10.60.62.248", 2121, "ftp", "863434", "/aworkhome/taotao/ftpuser/images", "/2018/04/19", "hello3.jpg", inputStream);

    }




}
