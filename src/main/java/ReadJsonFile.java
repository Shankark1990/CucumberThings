import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadJsonFile {
    public static void main(String[] args) throws IOException, ParseException {
        JSONParser parser=new JSONParser();
        JSONArray array=(JSONArray) parser.parse(new FileReader("resources/JsonData.json"));
        System.out.println(array.size());
        for(Object o:array){
            JSONObject data1=(JSONObject) o;
            String password=(String) data1.get("password");
            System.out.println(password);
            String error=(String) data1.get("error");
            System.out.println(error);

        }

        ObjectMapper objectMapper = new ObjectMapper();
        JSONData[] data = objectMapper.readValue(new File("resources/JsonData.json"), JSONData[].class);
        System.out.println(data.length);

        Object[][] objData = new Object[data.length][1];

        for (int i = 0; i < data.length; i++) {
            objData[i][0] = data[i];
//            System.out.println(objData.toString();
        }

    }
    
    @DataProvider(name = "json_data")
    public Object[][] passwordData() throws IOException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JSONData[] data = objectMapper.readValue(new File("resources/JsonData.json"), JSONData[].class);
        System.out.println(data.length);

        Object[][] objData = new Object[data.length][1];

        for (int i = 0; i < data.length; i++) {
            objData[i][0] = data[i];
//            System.out.println(objData.toString());
        }
        return objData;
    }

    @Test(dataProvider = "json_data")
    public void testPasswordValidation(JSONData data) {
        System.out.println(data.getPassword());
        System.out.println(data.getError());
    }

}
