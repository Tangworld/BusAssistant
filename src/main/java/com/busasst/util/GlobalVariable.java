package com.busasst.util;

import java.util.HashMap;
import java.util.Map;

/**
 * 存放全局变量
 * Created by sl on 16-3-3.
 */
public class GlobalVariable {
    Map<String , String> map;

    private void init() {
        if(this.map == null) {
            this.map = new HashMap<String , String>();
        }
        // TODO 修改为读取config.ini
        this.map.put("assetsPath", "/busasst/assets");
        this.map.put("uploadFilePath", "/usr/local/busasst");
        this.map.put("rootPath", "/busasst");
        this.map.put("requestPath","http://localhost:8080/busasst");
    }

    public Map<String , String> getAll() {
        this.init();
        return this.map;
    }
}
