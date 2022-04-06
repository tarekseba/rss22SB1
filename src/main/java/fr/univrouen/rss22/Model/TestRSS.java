package fr.univrouen.rss22.Model;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestRSS {
    public String loadFileXML() {
        Resource resource = new DefaultResourceLoader().getResource("classpath:xml/item.xml");
        String content = "";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(resource.getInputStream()), 1024);
            String line;
            while((line = br.readLine()) != null){
                content+=line;
            }
        } catch (Exception e) {
            return e.getMessage();
        }

        return content;
    }

    public InputStream loadInputStream() {
        Resource resource = new DefaultResourceLoader().getResource("classpath:xml/item.xml");


        try {
            return resource.getInputStream();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
