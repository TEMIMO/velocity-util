import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import org.apache.commons.io.FileUtils;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import ru.gov.pfr.ecp.fo.printedform.lib.util.DateConverter;
import ru.gov.pfr.ecp.fo.printedform.lib.util.NumbersTool;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Map;

public class VelocityConverter {
    public static void main(String[] args) throws IOException {
        VelocityContext context = new VelocityContext();

        File file = new File("src/main/resources/in/ПВ-Израиль_банки.xml");
        XStream xStream = new XStream(new DomDriver());
        // Написать корневой элемент вместо mass
        xStream.alias("mass", Map.class);
        xStream.registerConverter(new MapEntryConverter());
        Map<String,Object> map = (Map<String,Object>) xStream.fromXML(file);

        // Если использовать Jackson библиотеку приводить необходимо под собственный класс с Jackson аннотациями
        // var map = new XmlMapper().readValue(new FileInputStream(file), Map.class);

        context.put("data", map);
        context.put("numbersTool", new NumbersTool());
        context.put("dateConverter", new DateConverter());

        StringWriter stringWriter = new StringWriter();
        Reader reader = new FileReader("src/main/resources/in/sheet1.xml", StandardCharsets.UTF_8);
        Velocity.evaluate(context, stringWriter, "VelocityService", reader);

        byte[] bytes = stringWriter.toString().getBytes(StandardCharsets.UTF_8);
        String result = Arrays.toString(bytes);

        FileUtils.writeByteArrayToFile(new File("src/main/resources/out/sheet1.xml"), bytes);

        System.out.println(result);
    }
}

