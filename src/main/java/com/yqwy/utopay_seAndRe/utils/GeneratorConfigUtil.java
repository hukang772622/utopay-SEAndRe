package com.yqwy.utopay_seAndRe.utils;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/6/13.
 */
public class GeneratorConfigUtil {
    public void generator() throws Exception {

        List<String> warnings = new ArrayList<>();
        File configFile = new File("src\\main\\resources\\generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(true);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }

    public static void main(String[] args) {
        try{
            GeneratorConfigUtil generator = new GeneratorConfigUtil();
            generator.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
