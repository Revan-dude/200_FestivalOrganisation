package adapters;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class LocalDateAdapter extends XmlAdapter<LocalDate, String> {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

    @Override
    public String unmarshal(LocalDate v) throws Exception {
        return v.format(formatter);
    }

    @Override
    public LocalDate marshal(String v) throws Exception {
        return LocalDate.parse(v, formatter);
    }
}
