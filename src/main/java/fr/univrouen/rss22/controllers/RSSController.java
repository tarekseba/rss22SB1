package fr.univrouen.rss22.controllers;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import fr.univrouen.rss22.Model.Item;
import fr.univrouen.rss22.Model.TestRSS;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.InputStreamReader;

@RestController
public class RSSController {

    @GetMapping("/resume")
    public String getListRSSinXML() {
        return "Envoi de la liste des flux RSS";
    }
    @GetMapping("/id")
    public String getRSSinXML(@RequestParam(value="id") String id) {
        return "Détail du contenu RSS demandé " + id;
    }

    @GetMapping("/test")
    public String getRSSinXMLTest(@RequestParam(value="guid") int id, @RequestParam(value="titre") String titre) {
        return "Test<br> GUID = " + id + "<br>Titre = " + titre;
    }

    @PostMapping(value = "/testpost", consumes = "application/xml")
    public String postTest(@RequestBody String flux) {
        return ("<result><response>Message reçu : </response>"+ flux + "</result>");
    }

    @PostMapping(value = "/postrss", produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public String postRSS() {
        TestRSS rss = new TestRSS();
        return rss.loadFileXML();
    }

    @GetMapping(value = "/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public @ResponseBody
    Item[] getXML() {
        XmlMapper mapper = new XmlMapper();
        TestRSS rss = new TestRSS();
        Item[] item = null;

        try {
            String xml = rss.loadFileXML();
            System.out.println(xml);
            item = mapper.readValue(xml, Item[].class);
            System.out.println(item.toString());
        } catch(Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return item;
    }
}
