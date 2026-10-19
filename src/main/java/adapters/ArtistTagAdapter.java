package adapters;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

import java.util.List;

public class ArtistTagAdapter extends XmlAdapter<String, List<String>> {
    @Override
    public List<String> unmarshal(String v) throws Exception {
        return List.of(v.split(" "));
    }

    @Override
    public String marshal(List<String> v) throws Exception {
        return String.join(" ", v);
    }
}
