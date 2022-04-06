package fr.univrouen.rss22.Model;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Author")
@XmlAccessorType(XmlAccessType.NONE)
public class Author {
    @XmlAttribute
    private String name;
    @XmlElement
    private String email;
    @XmlElement
    private String uri;

    public void Author() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
