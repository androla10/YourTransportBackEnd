package com.devinspirare.internaldata.dto.mapping.interceptor;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class CustomDateSerializer  extends JsonSerializer<Date> {

    public static final SimpleDateFormat FORMATTER = new SimpleDateFormat("dd-MM-yyyy");

    @Override
    public void serialize(Date value, JsonGenerator gen, SerializerProvider arg2)
            throws IOException, JsonProcessingException {
        if (value == null) {
            gen.writeNull();
        } else {
            gen.writeString(FORMATTER.format(value.getTime()));
        }
    }
}