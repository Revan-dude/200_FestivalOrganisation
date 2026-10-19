import adapters.ArtistTagAdapter;
import adapters.LocalDateAdapter;
import enums.Genre;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.w3c.dom.Element;

import javax.xml.namespace.QName;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@XmlAccessorType(XmlAccessType.FIELD)

public class Artist {

    private String id;

    private String name;

    private String country;

    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    private LocalDate founded;

    @XmlJavaTypeAdapter(ArtistTagAdapter.class)
    private List<String> tags;

    private Genre genre;

    @XmlAnyAttribute
    private Map<QName, String> additionalAttributes;

    @XmlAnyElement
    private List<Element> elements;
}
