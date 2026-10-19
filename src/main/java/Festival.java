import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.namespace.QName;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@XmlRootElement(name = "festival")
@XmlAccessorType(XmlAccessType.FIELD)

public class Festival {

    private String name;

    private String location;

    @XmlJavaTypeAdapter(adapters.LocalDateAdapter.class)
    private LocalDate startDate;

    @XmlJavaTypeAdapter(adapters.LocalDateAdapter.class)
    private LocalDate endDate;

    @XmlAnyAttribute
    private Map<QName, String> additionalAttributes;

    @XmlElementWrapper(name = "artists")
    @XmlElement(name = "artist")
    private List<Artist> artists;

    @XmlElementWrapper(name = "stages")
    @XmlElement(name = "stage")
    private List<Stage> stages;
}
