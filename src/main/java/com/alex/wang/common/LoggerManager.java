package com.alex.wang.common;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
public class LoggerManager {
    public static void recordInfo(String msg){
        Logger accessLogger = LoggerFactory.getLogger("AccessLog");
        accessLogger.info(msg);
    }
    
   
}
