package com.mayunfeng.join.task

import com.mayunfeng.join.base.BaseCls
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.ApplicationContext
import org.springframework.context.ApplicationContextAware
import org.springframework.stereotype.Component
import java.io.File
import java.util.*


@Component
class StartContextTask : ApplicationContextAware, BaseCls() {

    @Value("\${config.user.image.path}")
    private lateinit var userImg: String
    @Value("\${config.user.static.path}")
    private lateinit var userStatic: String
    // jar 相对路径
    private val userDir = "${System.getProperty("user.dir")}${File.separator}"

    override fun setApplicationContext(applicationContext: ApplicationContext) {
        println("                                                                                   ,-,------,   \n" +
                " ____    ____                ___      _____             _                        _ \\(\\(_,--'  \n" +
                "|_   \\  /   _|             .' ..]    |_   _|           (_)                 <`--'\\>/(/(__      \n" +
                "  |   \\/   |     _   __   _| |_        | |     .--.    __    _ .--.        /. .  `'` '  \\     \n" +
                "  | |\\  /| |    [ \\ [  ] '-| |-'   _   | |   / .'`\\ \\ [  |  [ `.-. |     (`')  ,        @     \n" +
                " _| |_\\/_| |_    \\ '/ /    | |    | |__' |   | \\__. |  | |   | | | |      `-._,        /      \n" +
                "|_____||_____| [\\_:  /    [___]   `.____.'    '.__.'  [___] [___||__]         )-)_/--( (        \n" +
                "                \\__.'                                                         ''''  ''''        \n"
        )
        // 创建用户数据文件夹   user/img  user/...
        createUserDir()
    }

    fun createUserDir(){
        val rootUserPath = "$userDir$userStatic${File.separator}$userImg${File.separator}"
        val file = File(rootUserPath)
        if (!file.exists()) {
           file.mkdirs()
        }
    }

}