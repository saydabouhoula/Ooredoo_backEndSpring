package tn.esprit.ooredoo.adapter;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateAdapter extends XmlAdapter<String, LocalDate> {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    @Override
    public LocalDate unmarshal(String v) {
        return LocalDate.parse(v, DATE_FORMATTER);
    }

    @Override
    public String marshal(LocalDate v) {
        return v != null ? v.format(DATE_FORMATTER) : null;
    }
}

