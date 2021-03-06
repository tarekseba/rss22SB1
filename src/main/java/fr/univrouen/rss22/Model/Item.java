package fr.univrouen.rss22.Model;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlRootElement(name = "item")
@XmlAccessorType(XmlAccessType.NONE)
public class Item {
    private static final long serialVersionUID = 1L;
    @XmlAttribute
    private String guid;
    @XmlElement
    private String title;
    @XmlElement
    private String published;

    public Item(String guid, String title, String published) {
        super();
        this.guid = guid;
        this.title = title;
        this.published = published;
    }

    public Item() {}
    @Override
    public String toString() {
        return ("Article : " + title + "\n(" + guid
                + ") Le = " + published);
    }

    public String getGuid() {
        return guid;
    }

    public String getTitle() {
        return title;
    }

    public String getPublished() {
        return published;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublished(String published) {
        this.published = published;
    }
}
