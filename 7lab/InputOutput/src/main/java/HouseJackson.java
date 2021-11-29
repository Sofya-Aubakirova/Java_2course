import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class HouseJackson {
    public static String HouseToJson(House house) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(house);
    }

    public static House HouseFromJson(String stringJson) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(stringJson, House.class);
    }
}
