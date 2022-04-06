package fr.univrouen.rss22.Model;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "items")
@XmlAccessorType(XmlAccessType.NONE)
public class Items {
        private static final long serialVersionUID = 1L;
        @XmlElement(name = "item")
        private List<Items> items;


        public Items() {
            items = new ArrayList<>();
        }
        @Override
        public String toString() {
            String content = "";
            return content;
        }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }
}
